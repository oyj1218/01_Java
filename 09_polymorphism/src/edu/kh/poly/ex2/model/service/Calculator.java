package edu.kh.poly.ex2.model.service;


// 계산기 인터페이스
// -> 모든 계산기에 대한 공통 필드, 기능명을 제공하는 접점(interface)용도
public interface Calculator {
	// 인터페이스 : 추상클래스의 변형체(추상 클래스 보다 추상도가 높음)
	// - 추상 클래스 : 일부만 추상 메소드(0개 이상), 즉 없을 수도 있음
	// - 인터페이스 : 모두 추상 메소드, 즉 추상 클래스보다 더 추상이 많기에 추상도가 높다고 표현
	// 				부모로부터 만들어진 게 없고 모두 다 추상 메소드이기에 extends 사용이 아닌 implements를 사용한다
	
	// 필드(묵시적으로 public static final)
	// -> 어떻게 작성하든 모든 public static final
	public static final double PI = 3.14;
	static final int MAX_NUM = 10000;
	public int MIN_NUM = -10000;
	int ZERO = 0;
	
	// 메소드(묵시적으로 public abstract)
	public abstract int plus(int num1, int num2); // 추상메소드
	
	public abstract int minus(int num1, int num2);

	public abstract int multiple(int num1, int num2);
	
	public abstract int divide(int num1, int num2);
	
	

}
