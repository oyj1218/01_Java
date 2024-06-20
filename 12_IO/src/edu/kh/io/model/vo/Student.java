package edu.kh.io.model.vo;

import java.io.Serializable;


// Serializable
// -> 직렬화가 될 수 있는 객체가 상속 받는 인터페이스
// --> ObjectOutputStream이 객체를 내보낼 때 해당 인터페이스를 상속 받은 객체인 경우에만 직렬화 작업 진행

// Serializable을 상속했지만 구현할 메소드가 없다
// == 마커 인터페이스(표시용도의 인터페이스) = 그냥 껍데기만 있는 느낌

public class Student implements Serializable{
	private String name;
	private int grade;
	private int classRoom;
	private int number;
	private char gender;
	
	public Student() {}
	
	public Student(String name, int grade, int classRoom, int number, char gender) {
		super();
		this.name = name;
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.gender = gender;
		
	}

}
