package com.ravikethireddy;

public class TestK {

	public static void main(String[] args) {

	    Testc t1 = new Testc(2);
	    Testc t2 = t1;
	    t1.set(6); 
	    System.out.println(" t2 -- " + t2);
	    
	    String[] str = new String[3];
	    int[] yes = {1, 2, 3,4};
	    swap(yes, 1, 3);
	    
	    System.out.println(" t2 -- " + t2);
	    
	    A test = new AB(0);
	    System.out.println(test.getMessage());
	    
	}
	
	public static void swap(int[] x, int i, int j) {
		int temp;
		temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}

}
