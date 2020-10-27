package com.demo.java8;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());
		
		String value = "puneet";
		Optional<String> opt = Optional.of(value);
		System.out.println(opt.isPresent());
		if(opt.isPresent())
			System.out.println(opt.get());
		
		value = null;
		Optional<String> opt1 = Optional.ofNullable(value);
		System.out.println(opt1.isPresent());
		
		String name = Optional.ofNullable(value).orElseGet(()->"pqr");
		System.out.println(name);
		
		
		Integer year = 2020;
		Optional<Integer> yearOptional = Optional.of(year);
		boolean flag = yearOptional.filter(y -> y==2020).isPresent();
		System.out.println(flag);

	}

}
