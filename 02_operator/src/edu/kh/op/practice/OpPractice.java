package edu.kh.op.practice;

import java.util.Scanner;

public class OpPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		
		System.out.print("사탕 개수 :");
		int input2 = sc.nextInt();

		
		System.out.println("1인당 사탕 개수 : " + input1 / input2);

		System.out.println("남는 사탕 개수 : " + input1 % input2);
		
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : "); 	// 이름 : 홍길동
		String name = sc.next();

		System.out.print("학년 : "); // 학년 : 3
		int grade = sc.nextInt();

		System.out.print("반 : "); // 반 : 4
		int room = sc.nextInt();

		System.out.print("번호 : "); // 번호 : 15
		int number = sc.nextInt();

		System.out.print("성별 : "); // 성별 : 남학생
		String gender = sc.next();

		System.out.print("성적 : "); // 성적 : 85.75
		double score = sc.nextDouble();

		// 3학년 4반 15번 홍길동 남학생의 성적은 85.75점 입니다.
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다. \n", grade, room, number, name, gender, score);
		
	}
	
	// 메소드 명 : public void practice3(){}
	// 정수를 하나 입력 받아 짝수/홀수를 구분하세요
	// (0은 짝수로 취급합니다.)
	// 정수입력 : 3
	// 홀수 입니다
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : "); 		// 정수입력 : 3
		int input3 = sc.nextInt();
		
		
		String result1 = input3 % 2 == 0 ? "짝수" : "홀수"; 	// 홀수 입니다
		System.out.println(result1 + "입니다");
	
	}
	// 메소드 명 : public void practice4(){}
	// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
	// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
	// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : "); 
		int korean = sc.nextInt();
		
		System.out.print("영어 : "); 
		int english = sc.nextInt();
		
		System.out.print("수학 : "); 
		int math = sc.nextInt();
		
		
		int sum = korean + english + math;
		double average = sum / 3.0;
		
		System.out.println("합계 : " + sum);

		System.out.printf("평균 : %.1f\n", average);
		
		boolean result2 = (korean >= 40) && (english >=40) && (math >= 40) && (average >= 60);
		
		System.out.println(result2 ? "합격" : "불합격");
	}
}