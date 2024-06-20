package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1_1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();


		switch(input % 2) {
		case 0 : System.out.println("짝수입니다"); break;
		case 1 : System.out.println("홀수입니다"); break;
		default : System.out.println("양수만 입력해주세요");
		}
	}

	public void practice1_2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();

		if (input % 2 == 0) {
			System.out.println("짝수입니다");
		} else if (input % 2 == 1) {
			System.out.println("홀수입니다");
		} else {
			System.out.println("양수만 입력해주세요");
		}

	}


	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int korean = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();


		System.out.print("영어점수 : ");
		int english = sc.nextInt();

		int sum = (korean + math + english);
		double average = (korean + math + english)/3.0;


		if (korean >= 40 && math >= 40 && english >= 40 && average >= 60) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n", korean, math, english, sum, average);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}



	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();


		switch(num) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : System.out.println(num + "월은 31일까지 있습니다."); break;
		case 2 : System.out.println(num + "월은 28일까지 있습니다."); break;
		case 4 : case 6 : case 9 : case 11 : System.out.println(num + "월은 30일까지 있습니다."); break;
		default : System.out.println(num + "월은 잘못 입력된 달입니다.");
		}

	}




	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요: ");
		double weight = sc.nextDouble();

		double BMI = weight / (height * height);
		System.out.println("BMI 지수 : " + BMI);

		if (BMI >= 30) {
			System.out.println("고도 비만");
		} else if (25 <= BMI && BMI < 30) {
			System.out.println("비만");
		} else if (23 <= BMI && BMI < 25) {
			System.out.println("과체중");
		} else if (18.5 <= BMI && BMI < 23) {
			System.out.println("정상체중");
		} else {
			System.out.println("저체중");
		}

	}


	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수: ");
		double mid = sc.nextDouble();

		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble();

		System.out.print("과제 점수 : ");
		double homework = sc.nextDouble();

		System.out.print("출석 횟수 : ");
		double attend = sc.nextDouble();

		double all = (mid * 0.2) + (fin * 0.3) + (homework * 0.3) + (attend);


		System.out.println("================= 결과=================");



		if (attend < 20*0.7) {
			System.out.println("Fail [출석 횟수 부족(" + (int)attend + "/20)]");
		} else {
			System.out.println("중간 고사 점수(20) : " + (mid * 0.2));
			System.out.println("기말 고사 점수(30) : " + (fin * 0.3));
			System.out.println("과제 점수(30) : " + (homework * 0.3));
			System.out.println("출석 점수(20) : " + attend);
			System.out.println("총점 : " + all);

			if (all < 70) {
				System.out.println("Fail");
			} else if (all >= 70) {
				System.out.println("Pass");
			} else {
				System.out.println("잘못 입력했습니다");
			}
		}
	}

}