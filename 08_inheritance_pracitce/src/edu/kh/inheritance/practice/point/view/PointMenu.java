package edu.kh.inheritance.practice.point.view;

import java.util.Scanner;

import edu.kh.inheritance.practice.point.controller.CircleController;
import edu.kh.inheritance.practice.point.controller.RectangleController;



public class PointMenu {

	private Scanner sc = new Scanner(System.in);

	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();


	public void mainMenu_teacher() {
		int menuNum = 0;

		while(menuNum!=9) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch(menuNum) {
			case 1 : CircleMenu_teacher(); break;
			case 2 : rectangleMenu_teacher(); break;
			case 9 : System.out.println("종료합니다");
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	public void CircleMenu_teacher() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();

		switch(menuNum) {
		case 1 : calcCircum(); break;
		case 2 : calcCircleArea(); break;
		case 9 : break;
		default : System.out.println("잘못 입력하셨습니다. 메인 메뉴로 돌아갑니다\n");
		}

	}
	public void rectangleMenu_teacher() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 끝내기");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();

		switch(menuNum) {
		case 1 : calcCircum(); break;
		case 2 : calcCircleArea(); break;
		case 9 : break;
		default : System.out.println("잘못 입력하셨습니다. 메인 메뉴로 돌아갑니다\n");
		}
	}

	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();

		if(menuNum == 1) {
			this.circleMenu();

		}else if(menuNum == 2) {
			this.rectangleMenu();	

		}else if(menuNum == 9){
			System.out.println("종료합니다");
		} else {
			this.mainMenu();
		}
	}

	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();

		if(menuNum == 1) {
			this.calcCircum();

		}else if(menuNum == 2) {
			this.calcCircleArea();	

		}else {
			this.circleMenu();
		}
	}

	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();

		if(menuNum == 1) {
			this.calcPerimeter();

		}else if(menuNum == 2) {
			this.calcRectArea();	

		}else {
			this.rectangleMenu();
		}
	}

	public void calcCircum() {

		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int radius = sc.nextInt();

		System.out.println(cc.calcCircum(x, y, radius));
		this.mainMenu();
	}

	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("반지름 : ");
		int radius = sc.nextInt();

		System.out.println(cc.calcArea(x, y, radius));
		this.mainMenu();

	}

	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("높이 : ");
		int height = sc.nextInt();

		System.out.print("너비 : ");
		int width = sc.nextInt();

		System.out.println(rc.calcPerimeter(x, y, width, height));
		this.mainMenu();

	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표 : ");
		int y = sc.nextInt();

		System.out.print("높이 : ");
		int height = sc.nextInt();

		System.out.print("너비 : ");
		int width = sc.nextInt();

		System.out.println(rc.calcRectArea(x, y, width, height));
		this.mainMenu();
	}


}
