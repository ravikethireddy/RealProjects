package com.ravikethireddy;

@FunctionalInterface
public interface FunctionalInterface2 {

	void method2();
	
	default void log(String str){
		System.out.println("FunctionalInterface2 logging::"+str);
	}
	
}


