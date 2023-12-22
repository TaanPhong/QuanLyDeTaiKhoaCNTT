package com.trantanphong.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.trantanphong.dto.ClassDTO;
import com.trantanphong.entity.Class;

public interface ClassService {
	List<ClassDTO> getAllClasses();
	Class getClassByName(String className);
	Class getClassById(String classCode);
	boolean improtFileClass(MultipartFile file) throws IOException;
	ClassDTO save(ClassDTO dto);
	void delete(String classCode);
	List<ClassDTO> getAllClassBySubjectCode(String subjectCode);
}
