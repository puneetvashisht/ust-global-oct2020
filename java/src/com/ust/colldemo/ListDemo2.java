package com.ust.colldemo;

import java.util.ArrayList;

class Fruit extends Object {
	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Fruit f = (Fruit) obj;
		return this.name.equals(f.name);
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

}

public class ListDemo2 {

	public static void main(String[] args) {

		ArrayList<Fruit> fruits = new ArrayList<>();

		fruits.add(new Fruit("orange"));
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("grape"));

		System.out.println(fruits);
		
		System.out.println(new Fruit("apple").equals(new Fruit("apple")));

		System.out.println(fruits.contains(new Fruit("pineapple")));

//		ArrayList<String> fruits = new ArrayList<>();
//		
//		fruits.add("orange");
//		fruits.add("apple");
//		fruits.add("grape");
//		
//		System.out.println(fruits);
//		
//		System.out.println(fruits.contains("pineapple"));

	}

}
