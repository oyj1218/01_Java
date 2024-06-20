package edu.kh.inheritance.model.vo;

public class Child extends Parent{
	// class Parent 쪽 public final class Parent인 상태로
	// extends Parent라고 쓰면 오류 발생

	// The type Child cannot subclass the final class Parent
	// (final 클래스인 Parent는
	// Child 클래스를 자식으로 가질 수 없다.)

	@Override
	public void method() {
		System.out.println("오버라이딩");
	
		// Cannot override 
		// the final method from Parent
	
	}
}
