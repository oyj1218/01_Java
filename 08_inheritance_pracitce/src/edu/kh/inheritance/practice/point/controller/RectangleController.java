package edu.kh.inheritance.practice.point.controller;

import edu.kh.inheritance.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	public String calcRectArea(int x, int y, int width, int height) { // 넓이
		r.setX(x);  
		r.setY(y);  
		r.setWidth(width);
		r.setHeight(height);
		return "면적 : " + r.toString() + " / " + r.getWidth() * r.getHeight();
	}


	public String calcPerimeter(int x, int y, int width, int height) { // 둘레
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		return "둘레 : " + r.toString() + " / " 
		+ 2 * (r.getWidth() + r.getHeight());
	}

}
