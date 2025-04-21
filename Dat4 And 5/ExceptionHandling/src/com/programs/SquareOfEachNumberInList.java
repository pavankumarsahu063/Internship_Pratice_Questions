package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEachNumberInList {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(12,12,1,4,21,19);
		
		List<Integer> square=l.stream()
				.map(num->num*num)
				.collect(Collectors.toList());
		
		System.out.println(square);
	}

}
