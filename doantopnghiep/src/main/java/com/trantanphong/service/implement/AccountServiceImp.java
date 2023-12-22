package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.AccountConvert;
import com.trantanphong.dto.AccountDTO;
import com.trantanphong.entity.Acount;
import com.trantanphong.repository.AccountRepository;
import com.trantanphong.service.AccountService;
import com.trantanphong.service.MailerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AccountServiceImp implements AccountService{
	
	private static final String CHARACTERS = "ABCDEFGHIJK1234567890LMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz1234567890";
	@Autowired
	private AccountConvert accountConvert;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private MailerService mailerService;
	
	@Override
	public List<AccountDTO> getAllAccount() {
		// TODO Auto-generated method stub
		List<AccountDTO> accountDTOs = new ArrayList<>();
		List<Acount> acounts = accountRepository.findAll();
		for (Acount acount : acounts) {
			AccountDTO dto = accountConvert.toDTO(acount);
			accountDTOs.add(dto);
		}
		return accountDTOs;
	}

	@Override
	public AccountDTO save(AccountDTO dto) {
		// TODO Auto-generated method stub
		Acount oldEntiy = accountRepository.findById(dto.getUsername()).orElse(null);
		Acount newEntity = new Acount();
		if(oldEntiy == null) {
			newEntity = accountConvert.toEntity(dto);
			String password = generateRandomString(8);
			newEntity.setPassword(password);
			newEntity.setChange(true);
			mailerService.sendMail(newEntity.getUsername(), "Văn phòng khoa thông báo đăng ký tài khoản thành công.", 
					"Hệ thống quản lý đề tài sinh viên công nghệ thông tin thông báo đăng ký tài khoản thành công.\n"
					+ "Mật khẩu của bạn là: " + password + ".\n"
					+ "Đây là mail tự động vui lòng không phải hồi mail."
					);
		}
		else {
			newEntity = accountConvert.toEntity(oldEntiy, dto);
			newEntity.setChange(false);
		}
		return accountConvert.toDTO(accountRepository.save(newEntity));
	}

	public static String generateRandomString(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            // Tạo một số ngẫu nhiên từ 0 đến độ dài của chuỗi ký tự CHARACTERS
            int randomIndex = random.nextInt(CHARACTERS.length());
            
            // Lấy ký tự ở vị trí ngẫu nhiên từ chuỗi CHARACTERS và thêm vào chuỗi kết quả
            char randomChar = CHARACTERS.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }

	@Override
	public Acount findAccount(String username) {
		// TODO Auto-generated method stub
		Acount acount = accountRepository.findById(username).orElse(null);
		return acount;
	}

	@Override
	public AccountDTO getAccout(AccountDTO dto) {
		// TODO Auto-generated method stub
		Acount account = accountRepository.findById(dto.getUsername()).orElse(null);
		if(account == null)
			return null;
		else
		{
			if(!account.getPassword().equals(dto.getPassword()))
			{
				return null;
			}
			else
			{
				return accountConvert.toDTO(account);
			}
		}
	}

	@Override
	public String forgetPassword(String email) {
		// TODO Auto-generated method stub
		Acount acount = accountRepository.findById(email).orElse(null);
		if(acount  != null)
		{
			String password = generateRandomString(8);
			acount.setPassword(password);
			acount.setChange(true);
			acount = accountRepository.save(acount);
			
			mailerService.sendMail(email, "Phòng giáo vụ thông báo mật khẩu mới.", "Mật khẩu mới của bạn là: " + password + ".\n"
					+ "Vui lòng không tiết lộ mật khẩu ra bên ngoài." + "Đây là mail tự động vui lòng không phải hồi mail.");
			return "Sucsses";
		}
		return null;
	}
}
