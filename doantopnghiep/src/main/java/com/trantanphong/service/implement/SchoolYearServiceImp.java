package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.SchoolYearConvert;
import com.trantanphong.convert.SchoolYearResearchConvert;
import com.trantanphong.dto.SchoolYearDTO;
import com.trantanphong.dto.SchoolYearResearch;
import com.trantanphong.entity.SchoolYear;
import com.trantanphong.repository.SchoolYearRepository;
import com.trantanphong.service.SchoolYearService;

@Service
public class SchoolYearServiceImp implements SchoolYearService{

	@Autowired
	private SchoolYearRepository schoolYearRepository;
	
	@Autowired
	private SchoolYearConvert schoolYearConvert;
	
	@Autowired
	private SchoolYearResearchConvert schoolYearResearchConvert;
	
	@Override
	public List<SchoolYearDTO> getAll() {
		// TODO Auto-generated method stub
		List<SchoolYear> entities = schoolYearRepository.findAll();
		List<SchoolYearDTO> dtos = new ArrayList<>();
		for (SchoolYear schoolYear : entities) {
			SchoolYearDTO dto = schoolYearConvert.toDTO(schoolYear);
			dtos.add(dto);
		}
	 	return dtos;
	}

	@Override
	public SchoolYearDTO save(SchoolYearDTO dto) {
		// TODO Auto-generated method stub
		SchoolYear newEntity;
		if(dto.getId() != null)
		{
			SchoolYear oldEntity = schoolYearRepository.findById(dto.getId()).orElse(null);
			newEntity = schoolYearConvert.toEntity(oldEntity, dto);
		}
		else
		{
			newEntity = schoolYearConvert.toEntity(dto);
		}
		newEntity = schoolYearRepository.save(newEntity);
		return schoolYearConvert.toDTO(newEntity);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		schoolYearRepository.deleteById(id);
	}

	@Override
	public SchoolYear getMaxSchoolYear() {
		// TODO Auto-generated method stub
		List<SchoolYear> schoolYears = schoolYearRepository.getMaxSchoolYear();
		try {
			return schoolYears.get(0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<SchoolYearResearch> getStatisticalResearchYear() {
		// TODO Auto-generated method stub
		List<Tuple> statistical = schoolYearRepository.statisticalResearchYear();
		List<SchoolYearResearch> getStatistical = new ArrayList<>();
		for (Tuple tuple : statistical) {
			SchoolYearResearch schoolYearResearch = schoolYearResearchConvert.toSchoolYearResearch(tuple);
			getStatistical.add(schoolYearResearch);
		}
		return getStatistical;
	}

	@Override
	public SchoolYearDTO getSchoolYearMax() {
		List<SchoolYear> schoolYears = schoolYearRepository.getMaxSchoolYear();
		try {
			return schoolYearConvert.toDTO(schoolYears.get(0));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public SchoolYearDTO getSchoolYearByID(long id) {
		// TODO Auto-generated method stub
		SchoolYear entity = schoolYearRepository.findById(id).orElse(null);
		if(entity != null) {
			return schoolYearConvert.toDTO(entity);
		}
		return null;
	}
}
