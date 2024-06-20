package edu.kh.programmersedu.model.service;

import java.util.Arrays;
import java.util.Scanner;

public class ProgrammersService {
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String input = sc.next();
		System.out.println(input.charAt(0) + " : " + (int)input.charAt(0));
		System.out.println(input.charAt(1) + " : " + (int)input.charAt(1));
		System.out.println(input.charAt(2) + " : " + (int)input.charAt(2));
		System.out.println(input.charAt(3) + " : " + (int)input.charAt(3));
	}

	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + candy/person);

		System.out.println("남는 사탕 개수 : " + candy%person);

	}

	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("학년(정수) : ");
		int grade = sc.nextInt();

		System.out.print("반(정수) : ");
		int room = sc.nextInt();

		System.out.print("번호(정수) : ");
		int number = sc.nextInt();

		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();

		System.out.printf("%d학년 %d반 %d번 %s의 성적은 %.2f이다.", grade,room,number,name,score);
	}


	public void ex4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korean = sc.nextInt();

		System.out.print("영어 : ");
		int english = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = korean+math+english;
		double avg = sum/3.0;

		System.out.printf("합계 : " + sum);
		System.out.printf("\n평균 : " + avg);

	}

	public void ex5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력1 : ");
		int input1 = sc.nextInt();

		System.out.print("입력2 : ");
		int input2 = sc.nextInt();

		System.out.print("입력3 : ");
		int input3 = sc.nextInt();

		boolean result = (input1 == input2) && (input2 == input3) && (input1 == input3);
		System.out.println(result);

	}

	public void ex6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		if (age>19) {
			System.out.println("성인");
		}
		else if (13<age || age<=19) {
			System.out.println("청소년");
		}
		else {
			System.out.println("어린이");
		}
	}

	public void ex7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 입력 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int input2 = sc.nextInt();
		System.out.print("연산 기호 입력 : ");
		String op = sc.next();

		int result = 0;
		switch (op) {
		case "+" : result = input1 + input2; break;
		case "-" : result = input1 - input2; break;
		case "*" : result = input1 * input2; break;
		case "/" : if(input2 == 0) {
			System.out.print("0으로 나눌 수 없습니다");
		}
		else {result = input1 / input2; break;}
		case "%" : result = input1 % input2; break;
		default : System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다");return;
		}
		System.out.printf("수행 결과 : %d %s %d = %d",input1, op, input2, result );

	}

	public void ex8() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNum = sc.nextInt();

		switch (menuNum) {
		case 1 : System.out.println("입력 메뉴입니다"); break;
		case 2 : System.out.println("수정 메뉴입니다"); break;
		case 3 : System.out.println("조회 메뉴입니다"); break;
		case 4 : System.out.println("삭제 메뉴입니다"); break;
		case 5 : System.out.println("프로그램이 종료됩니다"); break;

		default : System.out.println("잘못 입력하셨습니다");

		}
	}

	public void ex9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num<0) {
			System.out.println("양수만 입력해주세요");
		}
		else if(num%2==1){
			System.out.println("홀수입니다");
		}
		else if(num%2==0) {
			System.out.println("짝수입니다");
		}
	}

	public void ex10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int korean = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();

		System.out.print("영어점수 : ");
		int english = sc.nextInt();

		int sum = korean+math+english;
		double avg = sum/3;

		if(korean>=40 && math>=40 && english>=40 && avg>=60) {
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다");
		}
	}

	public void ex11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();

		int result = 0;
		boolean flag = true;

		switch (num) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: result= 31; break;
		case 2: case 4: case 6: case 9: case 11: result = 30; break;
		default : System.out.println(num + "월은 잘못 입력된 달입니다");
		flag = false;
		}
		if(flag) {
			System.out.println(num +"월은 " + result +"일까지 있습니다");
		}	
	}


	public void ex12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요  : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();


		double BMI = weight / (height * height);
		System.out.println("BMI 지수 : " + BMI);

		if (BMI >=30) {
			System.out.println("고도비만");
		}
		else if (25<=BMI && BMI<30) {
			System.out.println("비만");
		}
		else if (23<=BMI && BMI<25) {
			System.out.println("과체중");
		}
		else if (18.5<=BMI && BMI<23) {
			System.out.println("정상체중");
		}
		else {
			System.out.println("저체중");
		}


	}

	public void ex13() {
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();

		System.out.print("과제 점수 : ");
		int pro = sc.nextInt();

		System.out.print("출석 횟수 : ");
		int att = sc.nextInt();

		System.out.println("===========결과===========");

		double mid_num = mid*0.2;
		double fin_num = fin*0.3;
		double pro_num = pro*0.3;
		double att_num = att;

		double sum= mid_num + fin_num + pro_num + att_num;


		if(att <= 14) {
			System.out.printf("Fail[출석 횟수 부족(%d/20)]", att);
		}
		else {
			System.out.println("중간 고사 점수(20) : " + mid_num);
			System.out.println("기말 고사 점수(30) : " + fin_num);
			System.out.println("과제 점수(30) : " + pro_num);
			System.out.println("출석 점수(20) : " + att_num);
			System.out.println("총점 : " + sum);

			if(sum>=70) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail [점수 미달]");
			}
		}
	}

	public void ex14() {
		Scanner sc = new Scanner(System.in);


		System.out.print("피연산자1 입력 : ");
		int input1 = sc.nextInt();

		System.out.print("연산자 입력(+,-,*,/,%) : ");
		String math = sc.next();
		if(math!="+") {
			System.out.println("잘못 입력하셨습니다");
		}

		System.out.print("피연산자1 입력 : ");
		int input2 = sc.nextInt();


		double result = 0;

		if(input1 < 0 || input2 < 0) {
			System.out.println("피연산자는 0보다 크거나 같은 수만 입력해주세요");
		}

		else {
			switch(math) {
			case "+" : result = input1+input2; break;
			case "-" : result = input1-input2; break;
			case "*" : result = input1*input2; break;
			case "/" : result = input1/(double)input2;
			if(input2==0) {
				System.out.println("0으로 나눌 수 없습니다");
			} break;
			case "%" : result = input1%input2; 
			if(input2==0) {
				System.out.println("0으로 나눌 수 없습니다");
			} break;
			}
			System.out.printf("%d %s %d = %f", input1, math , input2, result);
		}
	}

	// (X) 다시 풀어보기 별 마름모, 피라미드 문제
	public void ex15() {
		Scanner sc = new Scanner(System.in);

		System.out.println("홀수입력 : ");
		int input = sc.nextInt();
	}

	// (세모) 중간까지 풀다가 복잡해짐..그래도 풀 수 있을 것 같음
	public void ex16() {
		Scanner sc = new Scanner(System.in);
		int ameri = 0;
		int latte = 0;
		int vanilla = 0;

		Loop: while (true) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 아메리카노	3500원");
			System.out.println("2. 카페라떼	4100원");
			System.out.println("3. 바닐라라떼	4300원");
			System.out.println("=====================");

			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			System.out.print("수량 선택 : ");
			int amount = sc.nextInt();

			switch (menu) {
			case 1:
				ameri += amount;
				break;
			case 2:
				latte += amount;
				break;
			case 3:
				vanilla += amount;
				break;
			default:
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue;
			}

			while (true) {
				System.out.print("추가 주문하시겠습니까? (y/n) : ");
				char plus = sc.next().charAt(0);

				if (plus == 'Y' || plus == 'y')
					continue Loop;
				else if (plus == 'N' || plus == 'n') {
					System.out.println("=====================");

					if (ameri != 0)
						System.out.println("아메리카노 " + ameri + "잔 : " + ameri * 3500 + "원");
					if (latte != 0)
						System.out.println("카페라떼 " + latte + "잔 : " + latte * 4100 + "원");
					if (vanilla != 0)
						System.out.println("바닐라라떼 " + vanilla + "잔 : " + vanilla * 4300 + "원");

					System.out.println("=====================");

					int price = (ameri * 3500 + latte * 4100 + vanilla * 4300);
					System.out.println("총액 : " + price + "원");
					break;

				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
			}
			break;
		}
	}

	public void ex17() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if(input <=0) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
		else {
			for(int i=0; i<input; i++) {
				System.out.print(i + 1 + " ");
			}
		}
	}

	public void ex18() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if(input <=0) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
		else {
			for(int i=input; i>0; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void ex19() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();

		int sum =0;
		for(int i=0; i<input; i++) {
			sum = sum + (i+1);

			System.out.print(i+1);
			if(i+1 == input) {
				System.out.print(" = ");
			}
			else {
				System.out.print(" + ");
			}
		}System.out.print(sum);

	}

	public void ex20() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();

		if(input1>=input2) {
			for(int i=input2; i<=input1; i++) {
				System.out.print(i + " ");
			}
		}
		else {
			for(int i=input1; i<=input2; i++) {
				System.out.print(i + " ");
			}

		}
	}
	public void ex21() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int input = sc.nextInt();

		System.out.printf("===== %d단 =====\n", input);
		for(int i=1; i<10; i++) {
			System.out.print(input + " * " + i + " = " + input * i 
					+"\n");
		}
	}

	public void ex22() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int input = sc.nextInt();

		if(input>9) {
			System.out.println("2~9사이 숫자만 입력해주세요");
		}
		else {
			for(int j=input; j<10; j++) {
				System.out.printf("===== %d단 =====\n", j);
				for(int i=1; i<10; i++) {
					System.out.print(j + " * " + i + " = " + j * i 
							+"\n");
				}
			}
		}
	}

	public void ex23() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int i=0; i<input; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}System.out.println();

		}
	}

	public void ex24() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int i=0; i<input; i++) {
			for(int j=input; j>i; j--) {
				System.out.print("*");
			}System.out.println();
		}

	}
	// (x) 자연수 하나 문제
	// 자연수 하나를 입력하세요 : 15
	// 2 3 4 6 8 9 10 12 14 15
	// count : 2
	public void ex25() {
		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 0; i < num; i++) {
			if ((i + 1) % 2 == 0 || (i + 1) % 3 == 0) {
				System.out.print(i + 1 + " ");
				if ((i + 1) % (2 * 3) == 0) count++;
			}
		}
		System.out.println("\ncount : " + count);

		sc.close();
	}

	public void ex26() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int i=0; i<input; i++) {
			for(int j=input-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void ex27() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int i=0; i<input; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=0; i<input-1; i++) {
			for(int j=input-1; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void ex28() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int i=0; i<input; i++) {
			for(int j=input-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			for(int j=input-1; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	// (x) 박스모양 별표시
	public void ex29() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
	}

	public void ex30() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();


		if(input>=2) {
			for(int i=0; i<input; i++) {
				for(int j=0; j<i; j++) {
					System.out.print(" ");
				}
				for(int j=input; j>i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}

			System.out.println("==============");
			for(int i=0; i<input; i++) {
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				}
				for(int j=i+1; j>i; j--) {
					System.out.print(" ");
				}
				System.out.println();

			}
			System.out.println("==============");
		}
		if(input>=3) {
			for(int j=input; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
			for(int i=0; i<input-2; i++) {

				for(int j=i; j<i+1; j++) {
					System.out.print("*");
				}
				for(int j=input-1; j>0; j--) {
					System.out.print(" ");
				}
				System.out.println();
			}
			for(int j=input; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void ex31() {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기 입력 : ");
		String[] arr = new String[sc.nextInt()];

		for(int i=0; i<arr.length; i++) {
			System.out.print(i + 1 + "번째 문자열 : ");
			arr[i]=sc.next();

		}
		while(true) {
			System.out.println("값을 더 입력하시겠습니까? (Y/N) : ");
			String plus = sc.next();


		}


	}
	public void ex32() {
		Scanner sc = new Scanner(System.in);

		int input = 0;

		int[] arr = new int[5];

		for(int i=0; i<arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}

		System.out.print("검색할 값  : ");
		int search = sc.nextInt();

		boolean flag = true;

		for(int i=0; i<arr.length; i++) {
			if(search == arr[i]) {
				System.out.println("인덱스 : " + i);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("일치하는 값이 존재하지 않습니다");
		}
	}





	public void ex33() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		char[] arr = new char[str.length()];
		String index = "";
		int count = 0;

		for (int i = 0; i <arr.length; i++) {
			arr[i] = str.charAt(i);
			if (ch == arr[i]) {
				index += i + " ";
				count++;
			}
		}

		System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(ch + " 개수 : " + count);

		sc.close();
	}


	// (세모) 다시 풀어오기
	public void ex34() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int input = sc.nextInt();

		int sum = 0;
		int[] arr = new int[input];

		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+ i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];

		}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\n총 합 : " + sum);
	}


	// (세모) 주민등록번호 다시 풀어보기
	public void ex35() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();

		char[] arr= new char[str.length()];

		for(int i=0; i<arr.length; i++) {
			if(i>=8) {
				arr[i]='*';
			}
			else {
				arr[i]=str.charAt(i);
			}
			System.out.print(arr[i]);

		}

	}


	// (세모) 다시 풀어보기
	public void ex36() {
		Scanner sc = new Scanner(System.in);

		int num = 1;
		while(true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();

			if(input<3 || input%2==0) {
				System.out.println("다시 입력하세요");
			}
			else {
				int[] arr = new int[input];

				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length / 2) {
						arr[i] = num++;
					}
					else {
						arr[i] = num--;
					}

					if (i < arr.length - 1)
						System.out.print(arr[i] + ", ");
					else
						System.out.println(arr[i]);
				}


			}
		}
	}



	public void ex37() {
		Scanner sc = new Scanner(System.in);

		System.out.print("발생한 난수 : ");
		int[] arr = new int[10];

		for(int i=0; i<arr.length; i++) {
			arr[i]=(int) (Math.random()*10+1);

			System.out.print(arr[i]+ " ");
		}

	}

	public void ex38() {

		Scanner sc = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		System.out.print("발생한 난수 : ");
		int[] arr = new int[10];

		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);

			if (arr[i] > max)
				max = arr[i];

			if (arr[i] < min)
				min = arr[i];

			System.out.print(arr[i] + " ");
		}
		System.out.print("\n최대값 : " + max);
		System.out.print("\n최소값 : " + min);
	}

	public void ex39() {

		int[] arr = new int[10];

		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);

			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void ex40() {
		int[] lotto = new int[6];

		for(int i=0;i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);

			for(int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);

		for (int i = 0; i < lotto.length; i++)
			System.out.print(lotto[i] + " ");
	}

	public void ex41() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.next();

		int count = 0;
		char[] arr = new char[str.length()];
		System.out.println("\"문자열에 있는 문자 : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=str.charAt(i);
			boolean flag = true;

			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i])
					flag = false;
			}

			if (flag) {
				if (i == 0) {
					System.out.print(arr[i]);
				}
				else {
					System.out.print(", " + arr[i]);
				}
				count++;
			}
		}

	}

	public void ex42() {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		String[] arr = new String[sc.nextInt()];
		sc.nextLine();

		int index = 0;

		while (true) {
			for (int i = index; i < arr.length; i++) {
				System.out.print(i + 1 + "번째 문자열 : ");
				arr[i] = sc.nextLine();
			}

			index = arr.length;

			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char plus = sc.next().charAt(0);

			if (plus == 'Y' || plus == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				String[] arr2 = new String[arr.length + sc.nextInt()];
				sc.nextLine();

				System.arraycopy(arr, 0, arr2, 0, arr.length);
				arr = arr2;

			} else if (plus == 'N' || plus == 'n') {
				System.out.println(Arrays.toString(arr));
				break;

			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}

		}

	}
	public void ex43() {
		Scanner sc = new Scanner(System.in);

		System.out.println("배열의 크기 입력 : ");
		String[] arr = new String[sc.nextInt()];

		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"번째 문자열 : ");
			arr[i] = sc.nextLine();
		}

		System.out.println("값을 더 입력하시겠습니까? (Y/N) : ");
		String plus = sc.next();

		if(plus.toUpperCase().equals("Y")) {
			System.out.print("추가할 개수 : ");
			String[] arr2 = new String[arr.length + sc.nextInt()];
			System.arraycopy(arr, 0, arr2, 0, arr.length);

		}
		System.out.println();

	}

}

















