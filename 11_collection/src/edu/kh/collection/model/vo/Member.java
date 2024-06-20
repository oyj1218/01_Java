package edu.kh.collection.model.vo;

import java.util.Objects;

public class Member {
	private String id;
	private String pw;
	private int age;
	
	public Member() {
		
	}
	

	public Member(String id, String pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", age=" + age + "]";
	}

	
	// shift + alt + s - hashCode : hashCode 자동완성 가능
	@Override
	public int hashCode() {
		return Objects.hash(age, id, pw);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // 객체끼리 비교
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	}
	
	
	/*
	// Object.equals() 오버라이딩
	// - 현재 객체와 매개변수로 전달 받은 객체의 필드가 같은지 비교하는 형태로 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// 매개변수 다운 캐스팅
		Member other = (Member)obj;
		// 필드 값 비교
		return this.id.equals(other.id) && this.pw.equals(other.pw) && this.age==other.age;
	}
	
	
	
	// Object.hashCode() 오버라이딩
	@Override
	public int hashCode() {
		// hashCode() : 중복되지 않는 값을 만들어주는 메소드
		// 필드 값이 같이 아니면 다른 정수를 반환한다
		// 즉, 필드 값이 같은 객체는 같은 정수를 반환해야 한다.
		// 즉, 필드 값을 이용해서 정수를 만들면 된다.
		
		int result = 1; // 결과 저장 변수
		
		final int PRIME = 31; // 소수
		// 왜 31? 31이 연산 속도가 빠른 소수 중 하나라서 사용
		result = result * PRIME * age;
		
		result = result * PRIME * (id == null ? 0 : id.hashCode());
		
		result = result * PRIME * (pw == null ? 0 : pw.hashCode());
		
		return result;
		
	} */
	
}


