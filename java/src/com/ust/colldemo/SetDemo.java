package com.ust.colldemo;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

//		Set<String> fruits = new HashSet<>();
//
//		fruits.add("orange");
//		fruits.add("apple");
//		fruits.add("apple");
//		fruits.add("grape");
//
//		System.out.println(fruits);

//		System.out.println(fruits);

//		Set<Fruit> fruits = new HashSet<>();
		// Hashset are unordered
//		Set<Fruit> fruits = new LinkedHashSet<>();
		// LinkedHashset are ordered by insertion
		
		Set<Fruit> fruits = new TreeSet<>();
		// sorted
		
		fruits.add(new Fruit("orange"));
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("grape"));

		System.out.println(fruits);

	}

}
