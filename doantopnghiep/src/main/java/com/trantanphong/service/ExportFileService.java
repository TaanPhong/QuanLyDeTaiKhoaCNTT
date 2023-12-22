package com.trantanphong.service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public interface ExportFileService {
	void exportPDFStatisticalTotoal(HttpServletResponse response) throws IOException;
	void exportExcelStatisticalTotal(HttpServletResponse response) throws IOException;
	void exportPDFStatisticalResearchStudent(HttpServletResponse response) throws IOException;
	void exportExcelStatisticalResearchStudent(HttpServletResponse response) throws IOException;
	void exportPDFStatisticalResearchStudentBySchoolYear(HttpServletResponse response, long schoolID) throws IOException;
	void exportExcelStatisticalResearchStudentBySchoolYear(HttpServletResponse response, long schoolId) throws IOException;
}
