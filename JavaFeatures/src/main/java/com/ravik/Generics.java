package com.ravik;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Generics {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		Integer[] arr = { 1, 2, 3, 4, 5, 6 };

		Generics gen = new Generics();
		list = gen.fromArrayToList(arr);
		list.forEach((number) -> System.out.println(number));

	}

	public <T> List<T> fromArrayToList(T[] a) {
		return Arrays.stream(a).collect(Collectors.toList());
	}

	public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
		return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
	}

}
