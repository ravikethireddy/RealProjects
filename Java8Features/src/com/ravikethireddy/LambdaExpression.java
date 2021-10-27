package com.ravikethireddy;

import java.util.*;

public class LambdaExpression {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");

		list.forEach((name) -> System.out.println(name));
	}

}
