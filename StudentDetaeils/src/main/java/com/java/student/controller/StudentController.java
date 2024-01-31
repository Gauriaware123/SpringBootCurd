package com.java.student.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.student.model.StudentForm;
import com.java.student.service.StudentService;
import com.java.student.util.security.admin.BaseResource;
import com.java.student.util.security.admin.User;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value="v1/admin/students")
@AllArgsConstructor
@CrossOrigin("*")
public class StudentController extends BaseResource {
	
 private StudentService studentService;
 
 @GetMapping
 public List<StudentForm> getStudListCtrl(@RequestHeader("access-token") String token, HttpServletRequest request){
	 
	 User user = getUser(request);

     if(user==null) return null;
	List<StudentForm> studList =  studentService.getStudListService();
	
	return studList;

 }
 @GetMapping("/{snum}")
public StudentForm getStudBySnoCtrl(@PathVariable(value = "snum")int sno){
	 
	StudentForm studentForm =  studentService.getStudBySNoService(sno);
	
	return studentForm;

 }
 @PostMapping
 public  void insertStudCtrl( @RequestBody  StudentForm studentForm)
 {
	 studentService.insertStudService(studentForm);
 }
 @PutMapping
 public  void updateStudCtrl( @RequestBody  StudentForm studentForm)
 {
	 studentService.updateStudService(studentForm);
 }
 @DeleteMapping("/{snum}")
 public  void deleteStudCtrl( @PathVariable(value="snum")  int sno)
 {
	 studentService.deleteStudService(sno);
 }
}
