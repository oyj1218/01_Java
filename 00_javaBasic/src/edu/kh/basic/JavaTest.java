package edu.kh.basic;

// (한 줄) 주석 : 컴파일러가 해석하지 않는 부분, 주로 코드 부분 작성

/* 범위
 * 주석*/

// 컴파일러(Compiler) : 코드를 2진수(0,1)로 변환하는 번역기

// Java 코드 실행 순서 : 
// 코드 작성 -> ctrl + f11 실행(컴파일러가 2진수로 번역 -> JVM이 실행)

public class JavaTest {
	// class : 자바 코드가 작성되는 영역
	
	public static void main(String[] args) {
		//위의 친구 main method(메소드) : 자바 애플리케이션(프로그램)을 실행하기 위해 반드시 필요한 메소드
		
		System.out.println("Hello World!!");
		System.out.println("안녕하세요?");
		System.out.println("1234");
		
		System.out.println("----------------------------");
		
		// 숫자 연산 
		System.out.println("1 + 2");
		System.out.println(1 + 2);
	
		// ""안에 작성된 코드는 단순 문자열로 인식
		// ""안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		System.out.println(33 - 17);
		System.out.println(14 * 11);
		System.out.println(1500 / 15);
		
		// "(문자열)" + 숫자 함께 작성
		
		System.out.println("14 * 11 = " + 154);
		System.out.println("14 * 11 = " + 14 * 11);
		
		System.out.println("90 + 80 + 70 = " + (90 + 80 + 70));
		
		// + 기호의 역할
		// -> 숫자 + 숫자 = 덧셈 연산 결과
		// -> 문자열 + 숫자 또는
		//    문자열 + 문자열 ==> 이어쓰기
		
		// 자바는 사칙연산의 우선순위를 그대로 따른다!
	}
	
}
