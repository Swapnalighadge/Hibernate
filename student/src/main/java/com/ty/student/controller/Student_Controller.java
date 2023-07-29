package com.ty.student.controller;

import com.ty.student.dao.Student_Dao;
import com.ty.student.dto.Student;

public class Student_Controller {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(106);
		student.setName("Mona");
		student.setPhone(9755555213l);
		student.setAddress("Palghar");
		
		Student_Dao dao=new Student_Dao();
//		dao.saveStudent(student);
		
		dao.DeleteStudent(106);

	}

}
