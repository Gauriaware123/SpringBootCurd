package com.java.student.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.student.dao.StudentDao;
import com.java.student.model.StudentForm;
import com.java.student.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl  implements StudentService{

	private StudentDao studentDao;
	
	@Override
	public List<StudentForm> getStudListService(){
		List<StudentForm>studList = studentDao.getStudList();
				return studList;

}

	@Override
	public StudentForm getStudBySNoService(int sno) {
		 StudentForm  studentForm = studentDao.getStudBySNo(sno);
		 return  studentForm;
	}

	@Override
	public void insertStudService(StudentForm studentForm) {
		studentDao.insetStud(studentForm);
	}

	@Override
	public void updateStudService(StudentForm studentForm) {
		studentDao.updateStud(studentForm);
	}

	@Override
	public void deleteStudService(int sno) {
		studentDao.deleteStud(sno);
	}
	
}