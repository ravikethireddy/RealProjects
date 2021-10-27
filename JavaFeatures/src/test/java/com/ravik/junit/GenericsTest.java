package com.ravik.junit;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.ravik.Generics;

public class GenericsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void givenArrayOfIntegers_thanListOfStringReturnedOK() {
	    Integer[] intArray = {1, 2, 3, 4, 5};
	    List<String> stringList
	      = Generics.fromArrayToList(intArray, Object::toString);
	 
	    assertThat(stringList, hasItems("1", "2", "3", "4", "5"));
	}

}
