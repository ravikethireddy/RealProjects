package com.ravikethireddy;

public class A {
	private int myNum;
	public A(int x) {myNum = x;}
	public int getNumber() {return myNum;}
	public String getLetters() { return "A";}
	public String getMessage() {
		return this.getLetters() + "-" + this.getNumber();
	}
}
