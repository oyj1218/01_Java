package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	/* switch 문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 수행된다.
	 * 
	 * [작성법]
	 * switch(식{
	 * 
	 * case 결과값1 : 수행코드1; break;
	 * case 결과값2 : 수행코드2; break;
	 * case 결과값3 : 수행코드3; break;
	 * ...
	 * default : case를 모두 만족하지 않을 경우 수행하는 코드;
	 * 
	 * }
	 * 
	 * */
	
	
	public void ex1() {
		// 키보드로 정수를 입력 받아
		// 1 이면 "빨간색"
		// 2 이면 "주황색"
		// 3 이면 "노란색"
		// 4 이면 "초록색"
		// 1~4 사이 숫자가 아니면 "흰색" 출력
		
		Scanner sc = new Scanner(System.in);
								// System.in : 키보드 입력

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		

		String color;
		
		/*
		if(input == 1) {
			color = "빨간색"; 
		} else if(input == 2) {
			color = "주황색";
		} else if(input == 3) {
			color = "노란색";
		} else if(input == 4) {
			color = "초록색";
		} else {
			color = "흰색";
		}
		*/
		
		// 여러 값이 나오는 식
		switch(input) {
		case 1 : color = "빨간색"; break; 
		// input에 입력된 값이 1인 경우(case)
		// color 변수에 "빨강색"을 대입하고 switch 문을 멈춤(break)
		
		case 2 : color = "주황색"; break;
		case 3 : color = "노란색"; break;
		case 4 : color = "초록색"; break;
		default : color = "흰색"; // default = 기본값
		}
		System.out.println(color);
		
	}
	
	public void ex2() {
		// 정수를 입력 받아 4팀으로 나누기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int input = sc.nextInt();
		
		String team;
		
		// 1이면 백팀
		// 2이면 홍팀
		// 3이면 청팀
		// 나머지 흑팀
		
		switch(input % 4) {
		case 1 : team = "백팀"; break;
		case 2 : team = "홍팀"; break;
		case 3 : team = "청팀"; break;
		default : team = "흑팀";
		}
		System.out.println(team);
	}
	
	public void ex3() {

		// 달 입력 시 계절 판별(switch 버전)
		Scanner sc = new Scanner(System.in);

		System.out.print("달 입력 : ");
		int month = sc.nextInt();

		String season;

		switch(month) {
		case 1 : case 2 : case 12 : season = "겨울"; break;
		case 3 : case 4 : case 5 : season = "봄"; break;
		case 6 : case 7 : case 8 : season = "여름"; break;
		case 9 : case 10 : case 11 : season = "가을"; break;
		default : season = "잘못 입력"; break;
		}
		System.out.println(season);


	}
	public void ex4() {

		// 정수 2개와 연산자(+ - * / %) 1를 입력 받아서 결과 출력
		Scanner sc = new Scanner(System.in);

		// ex)
		// 정수 1 입력 : 4
		// 연산자 입력 : *
		// 정수 2 입력 : 3

		// 계산 결과 :  4 * 3 = 12
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("연산자 입력 : ");
		// sc.nextChar(); 스캐너는 문자 하나(char)를 입력 받는 기능이 별도로 존재하지 않음

		String op = sc.next(); // 다음 입력되는 한 단어(String) 읽어오기

		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();

		int cal;

		// case에 작성되는 값은 switch 식의 결과값 자료형은 리터럴 표기법
		switch(op) {
		case "+" : System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2); break;
		case "-" : System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2); break;
		case "*" : System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2); break;
		case "/" : 
			if (num2 == 0) {
				System.out.print("계산될 수 없다"); 
			}
			else {
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2); 
			}
			
			break;
		case "%" : System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2); break;
		default : System.out.println("존재하지 않는 연산자 입니다.");
		}
	}
}
