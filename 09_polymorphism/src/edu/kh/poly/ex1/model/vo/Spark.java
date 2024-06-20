package edu.kh.poly.ex1.model.vo;

public class Spark extends Car{ // 경차

	private double discountOffer; // 할인 혜택

	public Spark() {
		// super(); // super() 안 써도 컴파일러가 자동 추가
	}
	// 매개변수 생성자(상속 버전)
	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}
	// getter / setter
	public double getDiscountOffer() {
		return discountOffer;
	}
	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
}
