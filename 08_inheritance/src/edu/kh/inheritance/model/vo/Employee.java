package edu.kh.inheritance.model.vo;

public class Employee extends Person{
	// Person 상속 받음

	// 필드
	private String company; // 회사

	// 생성자
	public Employee() {}
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}


	// 메소드
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}


	// Person으로 부터 상속 받은 메소드 중
	// move() 메소드를 Employee에 맞게 재정의(==오버라이딩)
	// 기본적인 틀은 가져오고 내가 수정하는 것



	// 이것만 보면 move가 Employee의 기능이라고 생각할 수 있으니 아니라고 알려줘야함
	// @Override 어노테이션 : 해당 메소드가 오버라이딩 되었음을
	//				  	    컴파일러에게 알려주는 역할

	// 어노테이션(Annotation) : 컴파일러에게 알려주기 위한 코드
	//					  	  (컴파일러 인식용 주석)
	@Override
	public void move() {
		// 기존 부모 코드 삭제 후 자식이 새롭게 재정의
		System.out.println("오버라이딩된 move() 메소드");
		System.out.println("효율적으로 일을 마치고 칼퇴한다.");
	}

	// *** 오버라이딩 성립 조건 ***
	// 1. 메소드 이름 동일
	// 2. 반환형 동일
	// 3. 매개변수 동일
	// 4. 접근 제한자 같거나 더 넓은 범위
	// 		ex) (부모) protected -> (자식) protected or public
	// 5. 예외처리 범위는 같거나 더 좁게

	// + 부모의 private 메소드는 오버라이딩 불가
	// -> 왜? 자식이 접근할 수 없기 때문에

	@Override
	public String toString() {
		return super.toString() + " / " + company;


	}
}
