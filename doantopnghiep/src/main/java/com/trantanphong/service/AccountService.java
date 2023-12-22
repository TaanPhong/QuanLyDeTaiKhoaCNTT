package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.AccountDTO;
import com.trantanphong.entity.Acount;

public interface AccountService {
	List<AccountDTO> getAllAccount();
	AccountDTO save(AccountDTO dto);
	Acount findAccount(String username);
	AccountDTO getAccout(AccountDTO dto);
	String forgetPassword(String email);
}
