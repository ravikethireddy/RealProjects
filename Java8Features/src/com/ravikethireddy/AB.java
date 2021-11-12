package com.ravikethireddy;

public class AB extends A {
	public AB(int x) {super(x+1);}
	public int getNumber() {return super.getNumber() + 1;}
	public String getLetters() { return "AB-new after reverting";}

}
