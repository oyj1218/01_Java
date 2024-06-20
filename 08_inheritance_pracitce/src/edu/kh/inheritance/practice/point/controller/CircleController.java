package edu.kh.inheritance.practice.point.controller;

import edu.kh.inheritance.practice.point.model.vo.Circle;

public class CircleController { 
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) { // 넓이
		c.setX(x);  
		c.setY(y);  
		c.setRadius(radius);
		return "면적 : " + c.toString() + " / " 
		+ 3.14 * c.getRadius() * c.getRadius();
	}


	public String calcCircum(int x, int y, int radius) { // 둘레
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "둘레 : " + c.toString() + " / " + 3.14 * c.getRadius() * 2; 
	
	}

}
