package com.ust;

public class HelloWorld {
	
//	i: number= value
	int i = 23;
	
	

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		arr[0] = 34;
		
		int newArray[] ={10,20,30};
		
		//enhanced
		for(int element: newArray){
			System.out.println(element);
		}
		//index based
		for(int i=0;i<= newArray.length;i++){
			System.out.println(newArray[i]);
		}
		
//		System.out.println(arr);
	}

}
