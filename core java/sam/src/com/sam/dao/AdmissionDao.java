package com.sam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sam.model.Student;

public class AdmissionDao {
	
	public int admitStudent(Student student) {
		String url="jdbc:mysql://localhost:3306/TCS";
		String username="root";
		String password="root@123";
		int status=0;
		try (Connection connect=DriverManager.getConnection(url,username,password)){
			Statement stmt=connect.createStatement();
			status=stmt.executeUpdate("INSERT INTO student VALUES("+student.getId()+",'"+student.getName()+"','"+student.getEmail()+"',"+student.getCgpa()+"");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	public int dismissStudent(int sId) {
		String url="jdbc:mysql://localhost:3306/TCS";
		String username="root";
		String password="root@123";
		int status=0;
		try (Connection connect=DriverManager.getConnection(url,username,password)){
			Statement stmt=connect.createStatement();
			status=stmt.executeUpdate("DELETE FROM student WHERE id="+sId+"");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public int editStudent(Student stu) {
		String query = "UPDATE student SET name='"+stu.getName()+"',email='"+stu.getEmail()+"',cgpa="+stu.getCgpa()+" WHERE id="+stu.getId();
		String url="jdbc:mysql://localhost:3306/TCS";
		String username="root";
		String password="root@123";
		int status=0;
		try (Connection connect=DriverManager.getConnection(url,username,password)){
			Statement stmt=connect.createStatement();
			status=stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	public ArrayList<Student> getAllStudents() {
		String url="jdbc:mysql://localhost:3306/TCS";
		String username="root";
		String password="root@123";
		ArrayList<Student> list=null;
		try (Connection connect=DriverManager.getConnection(url,username,password)){
			Statement stmt=connect.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
			list=new ArrayList<Student>();
			while(rs.next()) {
				Student student =new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				student.setCgpa(rs.getInt(4));
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	// update student - update 
	// select student
	// delete student
}
