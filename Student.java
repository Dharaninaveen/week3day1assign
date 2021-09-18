package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Dharani");
	}
	public void studentDept() {
		System.out.println("ECE");
	}
	public void studentId() {
		System.out.println("121EC127");
	}
	
	public static void main(String[] args) {
		
		Student studobj=new Student();
		studobj.collegeName();
		studobj.collegeCode();
		studobj.collegeRank();
		studobj.deptName();
		studobj.studentName();
		studobj.studentDept();
		studobj.studentId();
	}
	 

}
