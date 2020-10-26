package com.chandan.mondayArray;

import java.util.Arrays;

public class ArrayOperation {
	int []arr;
	
	public ArrayOperation() {
		arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
	}
	
	public void insertAtFirst(int element) {
		for(int i = arr.length - 1; i> 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = element;
	}
	
	public void insertAtEnd() {
		
	}
	
	public void insertAtAnyPosition() {
		
	}
	
	public void print() {
		Arrays.stream(arr).forEach(e->System.out.print(e +" "));
	}
	
	public void sumAllElements() {
		System.out.println(Arrays.stream(arr).reduce((x,y)->x+y).getAsInt());
	}
	
	public static void  main(String []args) {
		ArrayOperation arrayOperation = new ArrayOperation();
		arrayOperation.print();
		System.out.println();
		arrayOperation.insertAtFirst(6);
		arrayOperation.print();
	}
}
