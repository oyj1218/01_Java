package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {

	// 3행 3열짜리 문자열 배열을 선언 및 할당하고
	// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여
	// "(0, 0)"과 같은 형식으로 저장 후 출력하세요.


	public void practice1() {
		String[][] arr = new String[3][3];
		for(int row=0; row<arr.length; row++) {

			for(int col=0; col<arr[row].length; col++) {
				System.out.printf("(%d, %d)", row, col); 
				// 선생님 코드 : arr[row][col] ="(" + row + ", " + col + ")";
			}
			System.out.println();
		}

	}

	public void practice2() {
		int[][] arr = new int[4][4];

		int num = 1;
		for(int row = 0; row < arr.length; row++) {
			for(int col= 0; col < arr[row].length; col++) {
				arr[row][col] = num++;
				System.out.printf("%3d", arr[row][col]); 
			}
			System.out.println();
		}
	}



	public void practice3() {
		int[][] arr = new int[4][4];

		int num = 16;

		for(int row = 0; row < arr.length; row++) {
			for(int col= 0; col < arr[row].length; col++) {
				arr[row][col] = num--;
				System.out.printf("%5d", arr[row][col]); 
			}
			System.out.println();
		}




	}

	public void practice4() {
		int[][] arr = new int[4][4];

		// 상수 사용법 : 변하지 않는 특정 값에 이름을 붙여줌
		final int ROW_LAST_INDEX = arr.length - 1;
		final int COL_LAST_INDEX = arr[0].length - 1;

		for (int row = 0; row < arr.length; row++) { // 행 반복
			// 행의 길이
			for (int col = 0; col < arr[row].length; col++) { // 열 반복
				// row번째 행의 열의 길이

				// 마지막 행, 마지막 열이 아닌 경우
				if (row != ROW_LAST_INDEX && col != COL_LAST_INDEX) {
					arr[row][col] = (int)(Math.random() * 10 + 1);

					arr[row][COL_LAST_INDEX] += arr[row][col];
					arr[ROW_LAST_INDEX][col] += arr[row][col];
					arr[ROW_LAST_INDEX][COL_LAST_INDEX] += arr[row][col] * 2;
				}
				System.out.printf("%5d ", arr[row][col]);
			}
			System.out.println();
		}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		char[][] arr;
		char ch = 'a';

		System.out.print("행 크기 : ");
		int rowSize = sc.nextInt();
		System.out.print("열 크기 : ");
		int colSize = sc.nextInt();

		arr = new char[rowSize][];

		for (int row = 0; row < arr.length; row++) {
			arr[row] = new char[colSize];

			for (int col = 0; col < arr[row].length; col++)
				arr[row][col] = (char)((Math.random() * 26) + 65);;
		}

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++)
				System.out.print(arr[row][col] + " ");

			System.out.println();
		}

	}
	public void practice5_teacher() {

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();

			System.out.print("열 크기 : ");
			int col = sc.nextInt();

			if(row<1 || row > 10 || col < 1 || col > 10 ) { // 1~10 사이 숫자가 아닌 경우
				System.out.println("반드시 1~10 사이의 점수를 입력해야 합니다.");
			}
			else {
				char[][] arr = new char[row][col];

				for(int i=0; i<row; i++) {
					for(int j=0; j<col; j++) {
						arr[i][j] = (char)(Math.random()*26+65);

						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}
		}
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		char result = 'a';
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		char[][] arr = new char[row][];


		for (int i = 0; i < arr.length; i++) {
			System.out.print("열 크기 : "); // 수 만큼의 반복을 통해 열의 크기 받기
			int col = sc.nextInt();

			arr[i] = new char[col];
		}			
		// 출력용 for문
		for (int i = 0; row < arr[i].length; i++) {
			for(int col=0; col<arr[row].length; col++) {

				arr[row][col] = result++;
				System.out.println(arr[row][col]+" ");
			}


			System.out.println();
		}
	}

	public void practice7() {	
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 			"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int row=0;	
		int col=0;

		System.out.println("== 1분단 ==");	
		for (int i = 0; i < students.length; i++) {
			if (i < students.length / 2) {			
				arr1[row][col] = students[i];
				System.out.print(arr1[row][col] + " ");			
				col++;

				if (col == arr1[row].length) {
					row++;
					col = 0;
					System.out.println();
				}	
			} else {
				arr2[row][col] = students[i];
				System.out.print(arr2[row][col] + " ");			
				col++;
				if (col == arr2[row].length) {
					row++;
					col = 0;
					System.out.println();
				}
			}	
			if (i == students.length / 2 - 1) {			
				row = 0;
				col = 0;
				System.out.println("== 2분단 ==");
			}	
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 			"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int row=0;	
		int col=0;

		System.out.println("== 1분단 ==");	
		for (int i = 0; i < students.length; i++) {
			if (i < students.length / 2) {			
				arr1[row][col] = students[i];
				System.out.print(arr1[row][col] + " ");			
				col++;

				if (col == arr1[row].length) {
					row++;
					col = 0;
					System.out.println();
				}	
			} else {
				arr2[row][col] = students[i];
				System.out.print(arr2[row][col] + " ");			
				col++;
				if (col == arr2[row].length) {
					row++;
					col = 0;
					System.out.println();
				}
			}
			if (i == students.length / 2 - 1) {			
				row = 0;
				col = 0;
				System.out.println("== 2분단 ==");
				//			}	
				//			System.out.println("=============");
				//			System.out.println("검색할 학생 이름을 입력하세요 : ");
				//			String name = sc.next();
				//			
				//			// 1분단, 2분단
				//			
				//			// 왼쪽, 오른쪽
				//			
				//			System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄에 있습니다", name, );
				//			
			}
		}


	}


	public void practice7_teacher() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 			"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int index = 0;
		System.out.println("== 1분단 ==");
		for(int row=0; row<arr1.length; row++) {
			for(int col=0; col<arr1[row].length; col++) {

				arr1[row][col] = students[index++];
				// students 배열 index번째 학생을 arr1[row][col]에 대입

				System.out.print(arr1[row][col]+" ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for(int row=0; row<arr2.length; row++) {
			for(int col=0; col<arr2[row].length; col++) {

				arr2[row][col] = students[index++];
				// students 배열 index번째 학생을 arr1[row][col]에 대입

				System.out.print(arr2[row][col]+" ");
			}
			System.out.println();
		}
	}
	public void practice8_teacher() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 			"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int index = 0;
		System.out.println("== 1분단 ==");
		for(int row=0; row<arr1.length; row++) {
			for(int col=0; col<arr1[row].length; col++) {

				arr1[row][col] = students[index++];
				// students 배열 index번째 학생을 arr1[row][col]에 대입

				System.out.print(arr1[row][col]+" ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for(int row=0; row<arr2.length; row++) {
			for(int col=0; col<arr2[row].length; col++) {

				arr2[row][col] = students[index++];
				// students 배열 index번째 학생을 arr1[row][col]에 대입

				System.out.print(arr2[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();

		for(int row=0; row<arr1.length; row++) {
			for(int col=0; col<arr1[row].length; col++) {
				if(arr1[row][col].equals(name)) { // 일치하는 학생 이름이 있을 경우

					if(col == 0) {
						System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 왼쪽에 있습니다.", name, row+1);
					} else {
						System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 오른쪽에 있습니다.", name, row+1);
					}

					System.out.println("\n있음");
				}
			}
		}

		for(int row=0; row<arr2.length; row++) {
			for(int col=0; col<arr2[row].length; col++) {
				if(arr2[row][col].equals(name)) { // 일치하는 학생 이름이 있을 경우

					if(col == 0) {
						System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 왼쪽에 있습니다.", name, row+1);
					} else {
						System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 오른쪽에 있습니다.", name, row+1);
					}

					System.out.println("\n있음");
				}
			}
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[6][6];

		System.out.print("행 인덱스 입력 : ");	
		int rowIndex = sc.nextInt();	
		System.out.print("열 인덱스 입력 : ");
		int colIndex = sc.nextInt();		

		for (int row = 0; row < arr.length; row++) {		
			for (int col = 0; col < arr[row].length; col++) {

				if(row == 0 && col != 0) {
					arr[row][col] = col-1 + " ";
					// col-1 // Type mismatch: cannot convert from int to String
					// col-1 + " " // 오류 해결
				} else if(row!=0 && col==0) {
					arr[row][col] = row-1 + " ";
				} else {arr[row][col] = " ";
				}

				arr[rowIndex+1][colIndex+1]="X";
				System.out.print(arr[row][col]);		
			}
			System.out.println();	
		}

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[6][6];

		System.out.print("행 인덱스 입력 : ");	
		int rowIndex = sc.nextInt();	
		System.out.print("열 인덱스 입력 : ");
		int colIndex = sc.nextInt();		

		for (int row = 0; row < arr.length; row++) {		
			for (int col = 0; col < arr[row].length; col++) {

				if(row == 0 && col != 0) {
					arr[row][col] = col-1 + " ";
					// col-1 // Type mismatch: cannot convert from int to String
					// col-1 + " " // 오류 해결
				} else if(row!=0 && col==0) {
					arr[row][col] = row-1 + " ";
				} else {arr[row][col] = " ";
				}

				arr[rowIndex+1][colIndex+1]="X";
				System.out.print(arr[row][col]);		
			}
			System.out.println();	
		}

	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);

		String[][] arr = new String[6][6];

		while (true) {
			System.out.print("행 인덱스 입력 : ");	
			int rowIndex = sc.nextInt();	
			System.out.print("열 인덱스 입력 : ");
			int colIndex = sc.nextInt();

			if (rowIndex == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			if(rowIndex != 99) {
				for (int row = 0; row < arr.length; row++) {		
					for (int col = 0; col < arr[row].length; col++) {
						if(row == 0 && col != 0) {
							arr[row][col] = col-1 + " ";
							// col-1 // Type mismatch: cannot convert from int to String
							// col-1 + " " // 오류 해결
						} else if(row!=0 && col==0) {
							arr[row][col] = row-1 + " ";
						} else {arr[row][col] = " ";
						}

						arr[rowIndex+1][colIndex+1]="X";

						System.out.print(arr[row][col]);
					}

					System.out.println();

				}

			}

		}
	}


	// String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
	// 그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 “X”로 변환해 2차원 배열을 출력하세요.

	public void practice11_teacher() {
		Scanner sc = new Scanner(System.in);

		String[][] arr = new String[6][6];

		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {

				if(row == 0 && col != 0) {
					arr[row][col] = col-1 + " ";

				} else if(row != 0 && col == 0) {
					arr[row][col] = row-1 + " ";

				} else {
					arr[row][col] = "  ";
				}
			}
		}
		System.out.print("행 인덱스 입력 : ");
		int rowIndex = sc.nextInt();

		while(true) {
			if (rowIndex == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.print("열 인덱스 입력 : ");
			int colIndex = sc.nextInt();


			arr[rowIndex+1][colIndex+1] = "X";

			// 출력용 for문
			for(int row=0; row<arr.length; row++) {
				for(int col=0; col<arr[row].length; col++) {

					System.out.print(arr[row][col]);
				}
				System.out.println(); // 줄바꿈
			}
			System.out.print("\n행 인덱스 입력 >> ");
			rowIndex = sc.nextInt();
		} 
	}


	public void bingoGame() {
		Scanner sc = new Scanner(System.in);

		System.out.print("빙고판 크기 지정 : ");
		int bingoSize = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[bingoSize*bingoSize];


		for(int i = 0; i<arr.length; i++){

			arr[i] = (int)(Math.random()*(bingoSize*bingoSize)+1);

			for (int j=0; j<i; j++){
				if(arr[i] == arr[j]){
					i--;
					break;
				}
			}
		}
		String bingo[][] = new String[bingoSize][bingoSize];
		int index = 0;



		for (int i = 0; i < bingoSize; i++) {
			for (int j = 0; j < bingoSize; j++) {
				bingo[i][j] = arr[index++] + "";
				System.out.print(bingo[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=======빙고게임 시작==========");
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			String intNum = sc.nextLine();

			boolean flag = true; // 검색된 값이 빙고판에 있는지 확인하기 위한 변수

			System.out.println();



			for (int i = 0; i < bingo.length; i++) {
				for (int j = 0; j < bingo[i].length; j++) {

					if((intNum).equals(bingo[i][j])){
						bingo[i][j]="★";
						flag = false; // 일치하는 값이 있을 경우
					}
					System.out.printf("%4s", bingo[i][j]);
				}
				System.out.println();
			}
			if(flag) { // 일치하는 값이 없을 경우
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
				continue;
			}

			// 빙고판 크기에 따라
			// 빙고 기준이 되는 문자열 생성
			// ex) 5 * 5 크기 빙고 -> 한 줄이 "★★★★★" 이면 빙고

			String bingoLine = "";
			for (int i = 0; i < bingoSize; i++) {
				for (int j = 0; j < bingoSize; j++) {
					bingoLine += "★";
				}
			}

			// 빙고 검사
			int bingoCount = 0; // 빙고 수를 저장할 변수

			// 가로(행) 또는 세로(열)의 문자를 더하여 하나의 문자열로 저장
			// --> 저장된 문자열의 모양이 "★★★★★" 인 경우 == 빙고
			// --> bingoCount 증가
			String row="";
			String col="";

			for(int i=0; i<bingo.length; i++) {
				// 매 반복 시 마다 row, col을 빈 문자열로 초기화
				// --> 바깥쪽 for문이 반복될 때 마다 검사하는 행과 열이 이동하므로
				// 	   빙고 여부를 검사하기 위한 row, col을 빈 문자열로 초기화 해야함

				for(int j=0; j<bingo[i].length; j++) {
					row += bingo[i][j]; // 현재 행의 문자를 모두 더함
					col += bingo[i][j];
				}

				if(row.equals(bingoLine)) { // 가로 빙고가 존재할 경우 //[0][1], [0][2]
					bingoCount++;
				}
				if(col.equals(bingoLine)) { // 가로 빙고가 존재할 경우 //[0][1], [0][2]
					bingoCount++;
				}


			}
			// 대각선 빙고 여부
			// 대각선 : diagonal(다이애그널)

			// 대각선은 빙고판에 두개만 존재
			// --> 대각선 문자를 더해서 저장할 변수 두개 선언 및 빈문자열로 초기화
			String dia1 = "";
			String dia2 = "";

			// 대각선은 for문 하나로 가능
			for(int i=0; i<bingo.length; i++) {
				dia1 = dia1 + bingo[i][i]; // 좌상 우하
				dia2 = dia2 + bingo[i][bingo.length-1]; // 우상 좌하

			}
			if(dia1.equals(bingoLine)) {
				bingoCount++;
			}
			if(dia2.equals(bingoLine)) {
				bingoCount++;
			}
			// 빙고 카운트 출력
			System.out.println("현재" + bingoCount + "빙고");

			// 빙고 개수가 3개 이상인 경우

			if(bingoCount >= 3) {
				System.out.println("****** BINGO !! *******");
				break;
			}

		} // while 문 끝
	}
}











