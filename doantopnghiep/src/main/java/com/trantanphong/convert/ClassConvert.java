package com.trantanphong.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trantanphong.dto.ClassDTO;
import com.trantanphong.dto.StudentDTO;
import com.trantanphong.entity.Class;
import com.trantanphong.entity.Student;

@Component
public class ClassConvert {
	
	@Autowired
	private StudentConvert studentConvert;
	
	public Class toEntity(ClassDTO dto) {
		Class entity = new Class();
		try {
			entity.setClassCode(dto.getClassCode());
			entity.setClassName(dto.getClassName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}
	
	public Class toEntity(ClassDTO dto, Class entity) {
		try {
			entity.setClassCode(dto.getClassCode());
			entity.setClassName(dto.getClassName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}
	
	public ClassDTO toDTO(Class entity) {
		ClassDTO dto = new ClassDTO();
		try {
			dto.setClassCode(entity.getClassCode());
			dto.setClassName(entity.getClassName());
			dto.setSubjectName(entity.getSubject().getNameSubject());
			if(!entity.getListStudents().isEmpty()) {
				List<StudentDTO> studentDTOs = new ArrayList<>();
				for (Student element : entity.getListStudents()) {
					StudentDTO newDTO = studentConvert.toDTO(element);
					studentDTOs.add(newDTO);
				}
				dto.setStudentDTOs(studentDTOs);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}
}
