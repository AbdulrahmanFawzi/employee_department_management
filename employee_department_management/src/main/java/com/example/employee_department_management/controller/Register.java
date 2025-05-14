package com.example.employee_department_management.controller;

public class Register {
	@PostMapping("/all")
	public void registerStudentInCourse2(@RequestBody HashMap<String, ?> request) {
		Integer stdId = (Integer) request.get("studentId");
		Student std = stdRepo.findById(stdId).orElse(null);
		
		Integer crsId = (Integer) request.get("courseId");
		Course crs = crsRepo.findById(crsId).orElse(null);
		if(crs != null) {
			crs.setStudents(std);			
		}
		else {
			crs = new Course();
			crs.setCourseId((Integer) request.get("courseId"));
			crs.setCourseName((String) request.get("courseName"));
			crs.setCourseCredits((Integer) request.get("courseCredits"));
			crs.setStudents(std);
		}
		
		crsRepo.save(crs);		
		
	}
}
