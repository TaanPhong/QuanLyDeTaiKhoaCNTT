package com.trantanphong.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

public interface AlfrescoService {
	String save(MultipartFile file, String studentCode) throws IOException;
	String saveAuto(MultipartFile[] files) throws IOException;
	List<String> listFileName();
	void exportFile(HttpServletResponse response, String documentId) throws IOException;
	String fileName(String reportCode);
	void deleteDocument(String reportCode, long id);
	byte[] getFile(String reportCode) throws IOException;
}
