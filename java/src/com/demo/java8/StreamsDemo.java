package com.demo.java8;


import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamsDemo {
	static class Book implements Comparable<Book>{		
		private long isbn;
		private String title;	
		private double rating;
		private double price;
		private String source;
		
		public Book(long isbn, String title, double rating, double price, String source) {
			this.isbn = isbn;
			this.title = title;
			this.rating = rating;
			this.price = price;
			this.source = source;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}

		public long getIsbn() {
			return isbn;
		}
		
		public String getTitle() {
			return title;
		}
		
		public double getRating() {
			return rating;
		}
		
		public double getPrice() {
			return price;
		}
		
		public String getSource() {
			return source;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (isbn ^ (isbn >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			if (isbn != other.isbn)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", title=" + title + ", rating=" + rating + ", price=" + price + ", source="
					+ source + "]";
		}

		@Override
		public int compareTo(Book o) {
			return this.title.compareTo(o.title);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
		
		
		// Imperative 
		System.out.println(books);
		int count = 0;
		for(Book b : books){
			if(b.rating > 4.8){
				System.out.println(b);
				count++;
			}
		}
		System.out.println(count);
		
		
		// a. set-up a source - sql table
		// b. 0 or more intermediate operations - where clause 
		// c. terminal operation (column select)
		
		// SELECT count(b) from books_table b where b.rating>4.8
		
		// SELECT * from books_table
		books.parallelStream()
		.filter((b)-> b.rating > 4.8)
		.distinct()
		.map(b -> b.price)
		.map(Math::round)
//		.map((b) -> Math.round(b.rating))
		.forEach(System.out::println);
//		.count();
//		System.out.println(countWithStreams);
		
		
		
		

		boolean anyMatch = books.stream()
		.anyMatch((b)-> b.rating>5.8 && b.price < 50);
		
		System.out.println(anyMatch);
		
		boolean allMatch = books.stream()
				.allMatch((b)-> b.rating>1.8);
				
				System.out.println(allMatch);
		
//		System.out.println(IntStream.of(14 ,3 ,56, 5665).max());	
//		
//		Stream<Integer> inifiteStream = Stream.iterate(2,  i-> i *2);
//		inifiteStream.limit(10).forEach(System.out:: println);
		
		
		OptionalDouble value = books.stream()
//		.filter((b)-> b.rating > 3.8)
		.distinct()
		.mapToDouble(Book::getRating)
		.average();
		
		System.out.println(value.getAsDouble());
//		.forEach(System.out::println);
		
		
		Set<Book> filteredBooks = books.stream()
		 .filter((b)-> b.rating > 4.8)
		.collect(Collectors.toCollection(TreeSet::new));
//		.forEach(System.out::println);
		
		System.out.println(filteredBooks);
		
		// Joining
		String bookNames = books.stream()
		.filter((b)-> b.rating > 4.8)
		.map((b)->b.title)
		.collect(Collectors.joining(", "));
//		.forEach(System.out::println);
		
		
		//Partitioning
		
		Map<Boolean, List<Book>> partitionedBookMap = books.stream()
		.collect(Collectors.partitioningBy((b)-> b.rating> 4.0 ));
		
		System.out.println(partitionedBookMap.get(true));
		System.out.println(partitionedBookMap.get(false));
		
		
		//Grouping
		
		
		Map<Character, List<Book>> groupedBookMap = books.stream()
		.collect(Collectors.groupingBy(b -> new Character(b.title.charAt(0))));	
//			
//				System.out.println(groupedBookMap.get(new Character("A")));
		
		//Summarizing
		
		DoubleSummaryStatistics stats = books.stream()
		.collect(Collectors.summarizingDouble(Book::getPrice));
//		stats.
		
		System.out.println(stats);
		// Reduce, Map, MapToInt
		
		Double totalPrice = books.stream()
		.map(Book::getPrice)
		.reduce(0.0, Double::sum);
//		.forEach(System.out::println);
		
		System.out.println(totalPrice);
		
		
		
		
	}
	
	
	

}