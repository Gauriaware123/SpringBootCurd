package com.java.student.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.java.student.dao.StudentDao;
import com.java.student.dao.extractor.StudentExtractor;
import com.java.student.dao.extractor.StudentListExtractor;
import com.java.student.model.StudentForm;

import lombok.AllArgsConstructor;
@Repository
@AllArgsConstructor
public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbctemplate;
	private StudentListExtractor studentListExtractor ;
    private StudentExtractor studentExtractor;
	@Override
	public List<StudentForm> getStudList() {
		List<StudentForm> studList = jdbctemplate.query("select * from  student order by sno",studentListExtractor::extractData);
		return studList;
	}

	@Override
	public StudentForm getStudBySNo(int sno) {
		StudentForm studentForm = jdbctemplate.query("select * from Student where sno=" +sno ,studentExtractor::extractData);
		return studentForm;
	}

	@Override
	public void insetStud(StudentForm studentForm) {
      String query = "insert into student values("+studentForm.getSno()+" ,'"+studentForm.getSname()+"',"+studentForm.getAge()+")";	
      jdbctemplate.update(query);
	}

	@Override
	public void updateStud(StudentForm studentForm) {
      String query ="update student set sname='" + studentForm.getSname() + " ' ,age=" + studentForm.getAge() + "where sno= "+ studentForm.getSno() +"";	
      jdbctemplate.update(query);
	}

	@Override
	public void deleteStud(int sno) {
     String query = "delete from student where sno= "+ sno;
     jdbctemplate.update(query);

	}

}
