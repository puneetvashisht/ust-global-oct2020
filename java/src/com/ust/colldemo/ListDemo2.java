package com.ust.colldemo;

import java.util.ArrayList;

class Fruit extends Object implements Comparable<Fruit> {
	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Fruit f = (Fruit) obj;
		return f.name.equals(this.name);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public int compareTo(Fruit o) {
		return o.name.compareTo(this.name);
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
