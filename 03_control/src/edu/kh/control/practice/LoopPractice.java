package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();

		if(num >= 1) {
			for(int i = 1; i <= num; i++){
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();

		if(num >= 1) {
			for(int i = num; i >= 1 ; i--){
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();

		int sum = 0;

		for(int i = 1; i <= num; i++) { //1~입력받은수
			System.out.print(i+ " + ");
			sum += i;
		}

		System.out.printf("= %d" , sum);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();

		if (num1 >= 1 && num2 >= 1 ) {
			if (num1 >= num2) {
				for (int i = num2 ; i <= num1 ; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = num1 ; i <= num2 ; i++) {
					System.out.print(i + " ");
				}
			}
		} else
			System.out.println("1 이상의 숫자를 입력해주세요");

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int dan = sc.nextInt();

		System.out.println("===== 4단 =====");

		for (int i = 1; i <= 9  ; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i );
		}
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int dan = sc.nextInt();

		if (dan > 9 || dan < 2) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int x = dan; x <= 9; x++) { // 1~9 단
				System.out.printf("===== %d단 =====\n", x);
				for (int i = 1; i <= 9  ; i++) {
					System.out.printf("%d * %d = %d\n", x, i, x*i );
				}
			}
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for(int x = 1 ; x <= num; x++) { // 4바퀴 반복
			for(int i = 1; i <= x; i++) { // * **
				System.out.print("*");
			}
			System.out.println(); 
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for(int x = num ; x >= 1; x--) { // 4바퀴 반복
			for(int i = x; i >= 1; i--) { // ****, ***
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for(int x = num ; x >= 1; x--) { // 4바퀴 반복
			for(int i = x-1; i >= 1; i--) { // 빈칸
				System.out.print(" ");
			}
			for(int i = 0; i <= num-x ; i++) { // * **
				System.out.print("*");
			}
			System.out.println(); 

		}

	}

	public void practice10() {
		/*
	         정수 입력 : 3
		 *
		 **
		 ***
		 **
		 *
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); // input이 3이라면

		// 위쪽 삼각형
		for(int x=1; x<= input; x++) { // 1~3 증가식

			for(int i=1; i <= x; i++) { // * 1~3
				System.out.print("*");
			}
			System.out.println();
		}
		// 아랫쪽 삼각형
		for(int y=input-1; y >= 1; y--) { // 2~1 감소식

			for(int i=1; i<=y; i++) { // *2~1
				System.out.print("*");
			}
			System.out.println();
		}
	}



	public void practice11() {
		/*
	         정수 입력 : 4
		 *
		 ***
		 *****
		 *******
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); // input이 4라면

		// 피라미드
		for(int x=1; x<= input; x++) { // 1~4 증가식
			// 공백 출력 for문 
			for(int i = input-x; i >= 1; i--) { // 빈칸 3~1
				System.out.print(" ");
			}
			// * 출력
			for (int i = 1; i <= 2*x-1; i++ ) { // * 홀수
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
	}


	public void practice12() {
		/*
    정수 입력 : 5
		 *****
		 *   *
		 *   *
		 *   *
		 *****
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// row : 행(줄)
		// col(column) : 열(칸)

		for(int row =1; row <= input; row++) {
			// row or col이 1 or input인 경우 * 출력
			// == 테두리


			for(int col=1; col<=input; col++) {
				if(row==1 || row==input || col==1 || col==input) {
					System.out.print("*");
				} else { // 내부
					System.out.print(" ");
				}
			}
			System.out.println();



		}
	}


	public void practice13() {

		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();

		int count = 0;

		for(int i = 1; i <= input; i++) {

			// i가 2의 배수 or 3의 배수
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");

				// 2와 3의 공배수인 경우
				if(i%2==0 && i%3==0) {
					count++; // count1 증가
				}

			} 
			System.out.println(); // 줄바꿈
			System.out.println("count : " + count);

		}
	}
}


