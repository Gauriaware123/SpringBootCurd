package com.java.student.service;

import java.util.List;

import com.java.student.model.StudentForm;

public interface StudentService {

	List <StudentForm> getStudListService();
	StudentForm getStudBySNoService(int sno);
	void insertStudService(StudentForm studentForm);
	void updateStudService(StudentForm studentForm);
	void deleteStudService(int sno);
}
