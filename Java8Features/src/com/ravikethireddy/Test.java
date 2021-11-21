package com.ravikethireddy;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("bill",  new Integer(19));
		m.put("laura",  new Integer(22));

		m.put("Nancy",  new Integer(45));
		m.put("george",  new Integer(38));
		m.put("ron",  new Integer(45));
		System.out.println("ron age -" + m.get("manas"));
		
		
		if (getTrue() || getFalse()) {
			System.out.print("!");
		}
		 List<Integer> li = new ArrayList<Integer>();
	      li.add(-19);
	      li.add(24);
	      li.add(5);
	      li.add(11);
	      li.add(-36);
	      li.add(12);	
	      li.add(99);
	      for (int i=3; i<5; i++) {
	    		li.set(6,  li.get(i));
	    		li.set(i,  li.get(i-1));
	    		li.set(i-1,  li.get(6));
	    	}
	      
	      
	      int ST = -1;
	      int c=0;
	      int s =0;
	      int a =0;
	      while (li.get(c).intValue() != ST) {
	          s = s + li.get(c).intValue();
	          c++;
	      }
	      
	      if (li.size() > 0){
	         a=  s/c;
	      }
	      a=0;
	    System.out.println(a); 
	    
	    int del = -1;
	    int x=3;
	    if (x/2 == 1) {
	    	del  = del + x;
	    }
	    x--;
	    if (x/2 == 0) {
	    	del = del + x;
	    }
	    System.out.println(" del -- " + del);
	    
	    Testc t1 = new Testc(2);
	    Testc t2 = t1;
	    t1.set(6); 
	    System.out.println(" t2 -- " + t2);
	    
	    int sum = 0;
	    int M = 2;
	    int N = 4;
	    for(int j=0; j<M; j++) {
	    	
	    	for (int i=0; i<N; i++) {
	    		sum +=1;
	    	}
	    }
	    System.out.println(" sum  -- " + sum);
	    
	    int[] yes = {1, 2, 3};
	    int y = minVal(yes, 1, 3);
	    
	    
	    List<Integer> alist = new ArrayList<Integer>();
	    for (int i=11; i<15; i++) {
	    	alist.add(i);
	    }
	    
	    for (int n : alist) {
	    	n=n+1;
	    }
	    System.out.println(" alsit  -- " + alist.get(1));
	}
	
	
	
	public static int minVal(int[] y, int first, int last) {
		
		int bestSoFar = y[first];
		for (int i=first+1; i<last; i++) {
			if (y[i] < y[bestSoFar])
				bestSoFar = y[i];
			
		}

		return bestSoFar;
		
		
	}
	
	public static boolean getTrue() {
		System.out.print("T"); 
		return true;
		
	}
	
	public static boolean getFalse() {
		System.out.print("F"); 
		return false;
		
	}
	


}
