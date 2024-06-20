package edu.kh.inheritance.model.service;

import java.util.Scanner;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {

	public void ex1() {
		// 상속 확인
		// - Person을 상속 받은 Student가 Person의 필드, 메소드를 사용할 수 있나?

		Person p = new Person();

		// p.name = "홍길동";
		// 오류 발생 : The field Person.name is not visible
		// private 때문에 직접 접근 불가
		p.setName("홍길동");
		p.setAge(30);
		p.setNationality("대한민국");

		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());

		
		System.out.println("--------------------------------");


		// Student 객체 생성
		Student std = new Student();

		std.setGrade(3);
		std.setClassRoom(5);

		// Person 클래스로부터 상속 받은 메소드
		std.setName("김길동");
		std.setAge(35);
		std.setNationality("대한민국");


		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());

		// Student가 Person의 메소드 뿐만 아니라 필드도 상속 받았는지 확인
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());

		
		System.out.println("--------------------------------");

		
		Employee emp = new Employee();

		// Employee만의 고유 메소드
		emp.setCompany("KH정보교육원");
		emp.setAge(22);
		emp.setNationality("일본");
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		// 추가된 breath() 메소드 확인하기
		// Person의 기능
		
		System.out.println("--------------------");
		
		p.breath();
		std.breath();
		emp.breath();

	}

	public void ex2() {
		// super() 생성자 사용 방법
		
		// Student 매개변수 5개 짜리 생성자
		Student std = new Student("공유", 38, "한국", 1, 5);
		
		System.out.println(std.getName()); // 공유
		System.out.println(std.getAge()); // 38
		System.out.println(std.getNationality()); // 한국
		System.out.println(std.getGrade()); // 1
		System.out.println(std.getClassRoom()); // 5
		
	}
	
	public void ex3() {
		// 오버라이딩 확인 예제
		
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move(); // 오버라이딩 X -> Person의 메소드 수행 Person.move()
		emp.move(); // 오버라이딩 O -> Employee 메소드 수행 Employee.move()
	}
	
	public void ex4() {
		
		// 모든 클래스는 Object 클래스의 후손
		// == 모든 클래스의 최상위 부모 Object
		
		// 1) Object 상속 여부 확인
		
		Person p = new Person(); // Object를 상속 받은 Person 객체 생성

		Student std = new Student();
		
		Scanner sc = new Scanner(System.in); // Person을 상속 받은 Student 객체 생성
		
		String str = "abc";
		// ** Object 상속과 단계적인 상속 확인
		System.out.println(p.hashCode()); // Object에서 물려 받은 haseCode()
		
		System.out.println(std.getAge()); // Person에서 물려 받은 getAge()
		
		System.out.println(std.hashCode());
		// Person이 Object에서 물려 받은 hashCode()를
		// Student가 또 물려 받아 사
		
		// -> 상속의 상속의 상속의 ... 상속 가능
		
		// * Object가 모든 클래스의 최상위 부모인지 확인
		System.out.println(sc.hashCode());
		// Object.hashCode()
		
		System.out.println(str.hashCode());
		// String.hashCode()
		// -> String이 Object에게 물려 받은 hashCode()를 오버라이딩함
		
	}
	
	public void ex5() {
		Person p = new Person("김무열", 34, "한국");
		System.out.println(p.toString());
		System.out.println(p);
		
		// print 구문 수행 시 참조 변수명을 작성하면
		// 자동으로 toString() 메소드를 호출해서 출력한다!
		
		System.out.println("---------------------------");
		
		Student std = new Student("윈터", 28, "미국", 4, 6);
		
		System.out.println(std.toString());
		// 1) Student 클래스 toString() 오버라이딩 전
		// Person으로 부터 상속 받은 오버라이딩된 toString() 수행
		
		// 2) Student 클래스 toString() 오버라이딩 후
		// Student의 toString() 수행
		
		Employee emp = new Employee("김건강", 28, "일본", "00증권");
		System.out.println(emp);
		
	}
	
	
		
}
