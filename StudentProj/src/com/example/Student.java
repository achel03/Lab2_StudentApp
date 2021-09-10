package com.example;

public class Student implements Comparable<Student>{
	String name;
	int no;
	int age;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int no, String name, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Student [no="+no+", name="+name+", age="+age+"]";
	}

}
