package edu.kh.oop.cls.model.vo;

class TestVO {

	// 접근 제한자 (default) : 같은 패키지 내에서만 import가 가능함을 나타냄
	
	// Student와 같은 패키지
	// -> public, protected, (default) 3개만 접근 가능
	
	public void ex() {
		System.out.println("같은 패키지");
		
		Student std = new Student(); // 학생 객체 생성
		
		System.out.println(std.v1);
		System.out.println(std.v2);
		System.out.println(std.v3);
		// System.out.println(std.v4); // The field Student.v4 is not visible
		// v4는 같은 패키지라도 private이기 때문
		// 다른 클래스에서 직접 접근 불가
		
	}
	


}
