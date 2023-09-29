package com.leetcode.explore;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintingArrayWithStream {

	public static void main(String[] args) {

		
		int[] intArray = new int[]{1, 2, 3, 4, 5, 6};
		String[] objArray = new String[]{"Java", "Python", "JavaScript"};

		// If using Stream.of(), primitive types need to be flatmapped
		Stream.of(intArray).flatMapToInt(Arrays::stream).forEach(System.out::print);
		IntStream.of(intArray).forEach(System.out::print);
		// Stream.of() with objects
		Stream.of(objArray).forEach(System.out::print);

		// Arrays.stream() works with both primitive types and objects
		Arrays.stream(intArray).forEach(System.out::print);
		Arrays.stream(objArray).forEach(System.out::print);

		// If using asList(), primitive types need to be flatMapped
		Arrays.asList(intArray).stream().flatMapToInt(Arrays::stream).forEach(System.out::print);
		Arrays.asList(objArray).stream().forEach(System.out::print);
		System.out.println(Arrays.stream(objArray).collect(Collectors.joining(",")));
		
		System.out.println(Arrays.stream(objArray).
		        map(String::toUpperCase).
		        filter(e -> e.startsWith("J")).
		        collect(Collectors.joining(",")));
	
	}

}
