package com.trantanphong.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.trantanphong.dto.AccountDTO;
import com.trantanphong.dto.ClassDTO;
import com.trantanphong.dto.LectureDTO;
import com.trantanphong.dto.PrositionDTO;
import com.trantanphong.dto.ResearchDTO;
import com.trantanphong.dto.SchoolYearDTO;
import com.trantanphong.dto.SchoolYearResearch;
import com.trantanphong.dto.StudentDTO;
import com.trantanphong.dto.SubjectDTO;
import com.trantanphong.dto.SubjectResearchStatistical;
import com.trantanphong.entity.Research;
import com.trantanphong.service.AccountService;
import com.trantanphong.service.AlfrescoService;
import com.trantanphong.service.ClassService;
import com.trantanphong.service.ExportFileService;
import com.trantanphong.service.LectureService;
import com.trantanphong.service.PositionService;
import com.trantanphong.service.ResearchService;
import com.trantanphong.service.SchoolYearService;
import com.trantanphong.service.StudentService;
import com.trantanphong.service.SubjectService;

@RestController
@CrossOrigin(origins = "http://localhost:3000", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE }, allowedHeaders = "*", allowCredentials = "true")
public class FacultySecretaryController {

	@Autowired
	private SubjectService subjectService;

	@Autowired
	private PositionService positionService;

	@Autowired
	private SchoolYearService schoolYearService;

	@Autowired
	private LectureService lectureService;

	@Autowired
	private AccountService accountService;

	@Autowired
	private ClassService classService;

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private ResearchService researchService;
	
	@Autowired
	private ExportFileService exportFileService;
	
	@Autowired
	private AlfrescoService alfrescoService;

	@GetMapping("/SchoolYears")
	public List<SchoolYearDTO> getAllSchoolYear() {
		return schoolYearService.getAll();
	}

	@PostMapping("/SchoolYear")
	public SchoolYearDTO addSchoolYear(@RequestBody SchoolYearDTO dto) {
		return schoolYearService.save(dto);
	}

	@PutMapping("/SchoolYear/{id}")
	public SchoolYearDTO updateSchoolYear(@RequestBody SchoolYearDTO dto) {
		return schoolYearService.save(dto);
	}

	@DeleteMapping("/SchoolYear/{id}")
	public void delete(@PathVariable long id) {
		schoolYearService.delete(id);
	}

	// ================================> Lecture
	// <========================================

	@GetMapping("/lectures")
	public List<LectureDTO> getAlllectures() {
		return lectureService.getAllLectures();
	}

	@PostMapping("/lectures")
	public LectureDTO addLecture(@RequestBody LectureDTO dto) {
		return lectureService.save(dto);
	}

	@PutMapping("/lectures/{id}")
	public LectureDTO update(@RequestBody LectureDTO dto) {
		return lectureService.save(dto);
	}
	
	@GetMapping("/lectures/{subjectCode}")
	public List<LectureDTO> getAllLecturesBySubjectCode(@PathVariable String subjectCode) {
		return lectureService.getAllLecturesBySubjectCode(subjectCode);
	}

	// ===============================> Position
	// <=====================================

	@GetMapping("/postions")
	public List<PrositionDTO> getAllPosition() {
		return positionService.getAll();
	}

	// =============================> subject <=============================

	@GetMapping("/subjects")
	public List<SubjectDTO> getAllSubjects() {
		return subjectService.getAll();
	}

	// ===================================> Account <===============================
	@GetMapping("/accounts")
	public List<AccountDTO> getAllAccount() {
		return accountService.getAllAccount();
	}

	// =====================================> Class <========================================
	@GetMapping("/classes")
	public List<ClassDTO> getAllClasses() {
		return classService.getAllClasses();
	}
	
	@PostMapping("/upload-file/class")
	public ResponseEntity<String> improtFile(@RequestParam("file") MultipartFile file) throws IOException{
		if(classService.improtFileClass(file))
			return ResponseEntity.ok("Upload file thành công");
		else
			return ResponseEntity.ok("Upload file bị lỗi");
	}
	
	@PostMapping("/class")
	public ClassDTO addClass(@RequestBody ClassDTO dto) {
		return classService.save(dto);
	}
	
	@PutMapping("/class/{classCode}")
	public ClassDTO updateClass(@RequestBody ClassDTO dto) {
		return classService.save(dto);
	}
	
	@DeleteMapping("/class/{classCode}")
	public void deleteClass(@PathVariable String classCode) {
		classService.delete(classCode);
	}
	
	@GetMapping("/class/{subjectCode}")
	public List<ClassDTO> getAllClassBySubjectCode(@PathVariable String subjectCode)
	{
		return classService.getAllClassBySubjectCode(subjectCode);
	}
 
	// ============================================> student <==============================
	@PostMapping("/upload-excel-student")
	public ResponseEntity<String> uploadListStudent(@RequestParam("file") MultipartFile file) throws IOException {
		boolean addListStudent = studentService.addListStudent(file);
		if (addListStudent)
			return ResponseEntity.ok("Upload file thành công");
		else
			return ResponseEntity.ok("Upload file xảy ra lỗi");
	}

	@GetMapping("/student/{className}")
	public List<StudentDTO> getAllStudentByNameClasses(@PathVariable String className) {
		return studentService.getStudentByNameClass(className);
	}

	@PutMapping("/student/{studentCode}")
	public StudentDTO updateStudent(@RequestBody StudentDTO dto) {
		return studentService.save(dto);
	}
	
	@PostMapping("/student")
	public StudentDTO addStudent(@RequestBody StudentDTO dto) {
		return studentService.save(dto);
	}
	
	@GetMapping("/student")
	public List<StudentDTO> getAllStudent(){
		return studentService.getAllStudents();
	}
	
	@DeleteMapping("/student/{studentCode}")
	public void deleteStudentCode(@PathVariable String studentCode) {
		studentService.delete(studentCode);
	}
	
	// ======================> Assginment <==============================
	@GetMapping("/assginment/{email}")
	public void assignment(@PathVariable String email) {
		researchService.assignTasks(email);
	}
	
	@GetMapping("/research/enligible/{subjectId}")
	public List<ResearchDTO> getALlResearchEnligible(@PathVariable String  subjectId){
		return researchService.getAllResearchEnigible(subjectId);
	}
	
	@PutMapping("/assginment/{studentCode}/{researchId}/{email}")
	public ResearchDTO updateResearchStudent(@PathVariable String studentCode, @PathVariable long researchId, @PathVariable String email) {
		return researchService.updateResearchByStudent(studentCode, researchId, email);
	}
	
	@GetMapping("/check/assginment")
	public boolean checkAssignment() {
		return researchService.checkAssignTasks();
	}
	
	@GetMapping("/check/studentNotResearch")
	public boolean checkStudentNotResearch()
	{
		return studentService.checkStudentNotResearch();
	}
	
	@GetMapping("/infor/sutdent/research")
	public long [] inforStudentNotResearch() {
		return studentService.getStudentNotResearch();
	}
	
	@GetMapping("/infor/student/research/all")
	public long getSumStudentNotResearch() {
		return studentService.getSumStudentNotResearch();
	}
	
	// ============================ statistical ==================================
	@GetMapping("/statistical/schoolyear/research")
	public List<SchoolYearResearch> getStatistical()
	{
		return schoolYearService.getStatisticalResearchYear();
	}
	
	@GetMapping("/statistical/subject/research/{schoolyearId}")
	public List<SubjectResearchStatistical> getResearchStatisticals(@PathVariable long schoolyearId){
		return subjectService.getStatistical(schoolyearId);
	}
	
	@GetMapping("/statistical/excel")
	public void exprotExcelStatisticalTotal(HttpServletResponse response) throws IOException{
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=revenue.xlsx";
		response.setHeader(headerKey, headerValue);
		exportFileService.exportExcelStatisticalTotal(response);
	}
	
	@GetMapping("/statistical/pdf")
	public void exportPDFStatisticalTotal(HttpServletResponse response) throws IOException{
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=revenue.pdf";
		response.setHeader(headerKey, headerValue);
		exportFileService.exportPDFStatisticalTotoal(response);
	}
	
	
	@GetMapping("/statistical/student/excel")
	public void exprotExcelStatisticalStudent(HttpServletResponse response) throws IOException{
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=revenue.xlsx";
		response.setHeader(headerKey, headerValue);
		exportFileService.exportExcelStatisticalResearchStudent(response);
	}
	
	@GetMapping("/statistical/student/pdf")
	public void exportPDFStatisticalStudent(HttpServletResponse response) throws IOException{
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=revenue.pdf";
		response.setHeader(headerKey, headerValue);
		exportFileService.exportPDFStatisticalResearchStudent(response);
	}
	
	@GetMapping("/statistical/student/excel/{schoolId}")
	public void exprotExcelStatisticalStudent(HttpServletResponse response, @PathVariable long schoolId) throws IOException{
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=revenue.xlsx";
		response.setHeader(headerKey, headerValue);
		exportFileService.exportExcelStatisticalResearchStudentBySchoolYear(response, schoolId);
	}
	
	@GetMapping("/statistical/student/pdf/{schoolId}")
	public void exportPDFStatisticalStudent(HttpServletResponse response, @PathVariable long schoolId) throws IOException{
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=revenue.pdf";
		response.setHeader(headerKey, headerValue);
		exportFileService.exportPDFStatisticalResearchStudentBySchoolYear(response, schoolId);
	}
	
	/// ============================ Upload file ===================================//
	@PostMapping("/uploadFile/repost/{studentCode}")
	public String uploadFileReport(@RequestParam("file") MultipartFile file, @PathVariable String studentCode) throws IOException {
		return alfrescoService.save(file, studentCode);
	}
	
	@PostMapping("/uploadFile/report/auto")
	public String uploadFileReportAuto(@RequestParam("files") MultipartFile[] files) throws IOException{
		return alfrescoService.saveAuto(files);
	}
	
	@GetMapping("/uploadFile/names")
	public List<String> getAllNameFile(){
		return alfrescoService.listFileName();
	}
	
	@GetMapping("/uploadFileReport/{documentId}")
	public void exportDocument(HttpServletResponse response, @PathVariable String documentId)throws IOException {
		alfrescoService.exportFile(response, documentId);
	}
	
	@DeleteMapping("/uploadFileReport/{documentId}/{id}")
	public void deleteFileReport(@PathVariable String documentId, @PathVariable long id) {
		alfrescoService.deleteDocument(documentId, id);
	}
	
	@GetMapping("/preview/{documentId}")
	public ResponseEntity<byte []> getFile(@PathVariable String documentId) throws IOException{
		byte[] fileContent = alfrescoService.getFile(documentId);
		return ResponseEntity.ok().body(fileContent);
	}
	
	@GetMapping("/check/uploadFileAuto")
	public boolean checkUploadFileAuto() {
		return researchService.checkUploadFileReport();
	}
}
