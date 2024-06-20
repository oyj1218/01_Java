package edu.kh.oop.abstraction.model.vo;

// VO(Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지
public class People { // 국민(사람) 클래스

	// 클래스란? 객체의 특성(속성, 기능)을 정의한 것
	// == 객체를 만들기 위한 설계도

	// 캡슐화 (Encapsulation)
	// - 데이터와 기능을 하나로 묶어서 관리하는 기법
	// - 데이터의 직접적인 접근을 제한하는 것이 원칙이다.
	// 	 -> 직접 접근을 못하기 때문에
	// 	 클래스 내부에 간접 접근 방법을 제공하는 기능을 작성해준다.

	// *** 데이터 직접 접근 제한 ***
	// public(공공의) -> private(사적인, 개인적인) 변경

	// 속성 == 값 == data
	// 값을 저장하기 위한 변수 선언
	// -> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)

	private String name;
	private int age;
	private char gender;
	private String phone;
	private String peopleNumber; // 001212-1234567 int로 작성하면 -가 빼기로 들어가기에 String
	private String address;

	// double bitCoin; // 공통점이 아니므로 제거


	// 기능 == 행동 == method
	public void tax() {
		System.out.println("세금을 냅니다.");
	}	

	public void vote() {
		System.out.println("투표를 합니다.");
	}

	// 캡슐화에서 사용할 간접 접근 기능(getter / setter)

	public void setName(String name) { // setter
		this.name = name;
	}

	public String getName() { // getter
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPeopleNumber() {
		return peopleNumber;
	}

	public void setPeopleNumber(String peopleNumber) {
		this.peopleNumber = peopleNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



}
