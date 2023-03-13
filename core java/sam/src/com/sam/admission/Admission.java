package com.sam.admission;

import java.util.ArrayList;
import java.util.Scanner;

import com.sam.dao.AdmissionDao;
import com.sam.model.Student;

public class Admission {
	public static void main(String[] args) {
		//studentAdmission();
		//dismissStudent();
		//updateStudent();
		AdmissionDao admissionDao=new AdmissionDao();
		ArrayList<Student> listOfStudent=admissionDao.getAllStudents();//list
		for (Student student : listOfStudent) {
			System.out.println(student.getId());
			System.out.println(student.getEmail());
			System.out.println(student.getName());
			System.out.println(student.getCgpa());
		}
	}

	public static void updateStudent() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the student details you want update");
		System.out.println(""
				+ "Enter the Student ID you want to update");
		int studentId=s.nextInt();
		s.nextLine();
		
		System.out.println("Enter the student new updated name");
		String studentName=s.nextLine();
		System.out.println("Enter the Student  new updated Email");
		String studentEmail=s.next();
		System.out.println("Enter the new updated CGPA");
		int studentCgpa=s.nextInt();
		Student student=new Student();
		student.setId(studentId);
		student.setEmail(studentEmail);
		student.setName(studentName);
		student.setCgpa(studentCgpa);
		
		AdmissionDao admissionDao=new AdmissionDao();
		int result=admissionDao.editStudent(student);
		if(result!=0) {
			System.out.println("Student updated");
		}else {
			System.out.println("Student is not updated");
		}
		s.close();
	}

	public static void dismissStudent() {
		Scanner s=new Scanner(System.in);
		System.out.println(""
				+ "Enter the Student ID that you want to dismiss");
		int studentId=s.nextInt();
		AdmissionDao aDao=new AdmissionDao();
		int result = aDao.dismissStudent(studentId);
		if(result!=0) {
			System.out.println("Student Dismissed");
		}else {
			System.out.println("Student is not Dismissed");
		}
		s.close();
	}

	public static void studentAdmission() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the student details");
		System.out.println(""
				+ "Enter the Student ID");
		int studentId=s.nextInt();
		s.nextLine();
		
		System.out.println("Enter the student name");
		String studentName=s.nextLine();
		System.out.println("Enter the Student Email");
		String studentEmail=s.next();
		System.out.println("Enter the CGPA");
		int studentCgpa=s.nextInt();//200,    abc         abc@gmail.com 7
		Student student=new Student(studentId,studentName,studentEmail,studentCgpa);
		AdmissionDao admissionDao=new AdmissionDao();
		
		int result=admissionDao.admitStudent(student);
		if(result!=0) {
			System.out.println("Student Admitted");
		}else {
			System.out.println("Student is not admitted");
		}
		s.close();
	}
}
