package com.java.student.dao;

import java.util.List;

import com.java.student.model.StudentForm;

public interface StudentDao {

	List<StudentForm>getStudList();
	StudentForm getStudBySNo(int sno);
	void insetStud(StudentForm studentForm);
	void updateStud(StudentForm studentForm);
	void deleteStud(int sno);


}
