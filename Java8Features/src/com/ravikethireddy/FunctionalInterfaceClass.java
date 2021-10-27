package com.ravikethireddy;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FunctionalInterfaceClass implements FunctionalInterface1, FunctionalInterface2  {

		@Override
		public void method2() {
		}

		@Override
		public void method1(String str) {
		}

		//FunctionalInterfaceClass won't compile without having it's own log() implementation
		@Override
		public void log(String str){
			System.out.println("MyClass logging::"+str);
			FunctionalInterface1.print("Ravi");
		}
		
}
