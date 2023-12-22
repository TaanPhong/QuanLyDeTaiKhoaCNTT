package com.trantanphong.service;

import java.util.List;
import com.trantanphong.dto.LectureDTO;

public interface LectureService {
	List<LectureDTO> getAllLectures();
	LectureDTO save(LectureDTO dto);
	LectureDTO getLecture(String username);
	LectureDTO getLectureById(long id);
	List<LectureDTO> getAllLecturesBySubjectCode(String subjectCode);
}
