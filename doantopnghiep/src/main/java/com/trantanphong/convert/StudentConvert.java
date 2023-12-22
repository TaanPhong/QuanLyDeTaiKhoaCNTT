package com.trantanphong.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trantanphong.dto.StudentDTO;
import com.trantanphong.entity.Student;
import com.trantanphong.service.AlfrescoService;
import com.trantanphong.service.SchoolYearService;

@Component
public class StudentConvert {
	@Autowired
	private SchoolYearService schoolYearService;
	
	@Autowired
	private AlfrescoService alfrescoService;

	public Student toEntity(StudentDTO dto) {
		Student entity = new Student();
		try {
			entity.setStudentCode(dto.getStudentCode());
			entity.setSurname(dto.getSurname());
			entity.setFirstName(dto.getFirstName());
			if (dto.getGender().equals("Nam")) {
				entity.setGender((long) 0);
			} else {
				entity.setGender((long) 1);
			}
			entity.setEmail(dto.getEmail());
			entity.setNumberPhone(dto.getNumberPhone());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public Student toEntity(Student entity, StudentDTO dto) {
		try {
			entity.setStudentCode(dto.getStudentCode());
			entity.setSurname(dto.getSurname());
			entity.setFirstName(dto.getFirstName());
			if (dto.getGender().equals("Nam")) {
				entity.setGender((long) 0);
			} else {
				entity.setGender((long) 1);
			}
			entity.setEmail(dto.getEmail());
			entity.setNumberPhone(dto.getNumberPhone());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public StudentDTO toDTO(Student entity) {
		StudentDTO dto = new StudentDTO();
		try {
			dto.setStudentCode(entity.getStudentCode());
			dto.setSurname(entity.getSurname());
			dto.setFirstName(entity.getFirstName());
			dto.setEmail(entity.getEmail());
			dto.setNumberPhone(entity.getNumberPhone());
			if (entity.getGender() == 0) {
				dto.setGender("Nam");
			} else {
				dto.setGender("Nữ");
			}
			dto.setFullName(entity.getSurname() + " " + entity.getFirstName());
			dto.setClassCode(entity.getClassID().getClassCode());
			dto.setSubjectName(entity.getClassID().getSubject().getNameSubject());
			dto.setSubjectCode(entity.getClassID().getSubject().getSubject_code());
			if (entity.getResearch() != null) {
				dto.setResearchName(entity.getResearch().getResearchName());
				dto.setResearchId(entity.getResearch().getId());
				if(entity.getResearch().getReportDocumnetCode() != null)
					dto.setReportDocumentCode(entity.getResearch().getReportDocumnetCode());
				if(entity.getResearch().getReportFileName() != null)
				{
					dto.setReportFile(entity.getResearch().getReportFileName());
				}
			}
			else
				dto.setUpdateResearch(true);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}
}
