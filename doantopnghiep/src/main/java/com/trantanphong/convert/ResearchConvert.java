package com.trantanphong.convert;
import org.springframework.stereotype.Component;
import com.trantanphong.dto.ResearchDTO;
import com.trantanphong.entity.Research;

@Component
public class ResearchConvert {
	
	public Research toEntity(ResearchDTO dto) {
		Research entity = new Research();
		try {
			entity.setResearchName(dto.getResearchName());
			entity.setTheoreticalContent(dto.getTheoreticalContent());
			entity.setPracticeContext(dto.getPracticeContext());
			entity.setNote(dto.getNote());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public Research toEntity(Research entity, ResearchDTO dto) {
		try {
			entity.setResearchName(dto.getResearchName());
			entity.setTheoreticalContent(dto.getTheoreticalContent());
			entity.setPracticeContext(dto.getPracticeContext());
			entity.setNote(dto.getNote());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public ResearchDTO toDTO(Research entity) {
		ResearchDTO dto = new ResearchDTO();
		try {
			dto.setResearchID(entity.getId());
			dto.setResearchName(entity.getResearchName());
			dto.setPracticeContext(entity.getPracticeContext());
			dto.setTheoreticalContent(entity.getTheoreticalContent());
			dto.setAcademicYear(entity.getSchoolYear().getAcademicYear());
			dto.setFullNameLecture(entity.getLecture().getSurname() + " " + entity.getLecture().getFirstName());
			dto.setSchoolYearName(entity.getSchoolYear().getSchoolYearName());
			if(entity.getReportDocumnetCode() != null) {
				dto.setReportDocumnetCode(entity.getReportDocumnetCode());
				//dto.setReportFile(alfrescoService.fileName(entity.getReportDocumnetCode()));
			}
			if(entity.getReportFileName() != null)
			{
				dto.setReportFile(entity.getReportFileName());
			}
			if(entity.getStudent() != null) {
				dto.setStudentCode(entity.getStudent().getStudentCode());
				dto.setFullNameStudent(entity.getStudent().getSurname() + " " + entity.getStudent().getFirstName());
			}
			if(entity.getNote() != null)
			{
				dto.setNote(entity.getNote());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}

}
