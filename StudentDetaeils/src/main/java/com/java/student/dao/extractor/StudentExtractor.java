package com.java.student.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.java.student.model.StudentForm;

@Component
public class StudentExtractor implements ResultSetExtractor<StudentForm>{

	@Override
	public StudentForm extractData(ResultSet rs) throws SQLException, DataAccessException {
		StudentForm studentform = new StudentForm(0, null, 0);
		
		if(rs.next())
		{
			studentform.setSno(rs.getInt("sno"));
			studentform.setSname(rs.getString("sname"));
			studentform.setAge(rs.getInt("age"));
		}
		return studentform;
	}

	
	
	
}
