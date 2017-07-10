package com.arrays;

public class SortedArrayOperations {

	public static void main(String[] args) {
		
		int arr[] = { 5, 6, 7, 9, 10,11 };
		int n = arr.length;
//		int searchKey = 7;
		
//		int index = binarySearch(arr, 0,n, searchKey);
//		System.out.println(index);
		int start = 0;
		int newItem = 8;
		insertItemInSortedArray(arr,start, n, newItem);
		
	} 

	private static void insertItemInSortedArray(int[] arr, int start, int end, int newItem) {
		
		
		int mid = end/2;
		if(newItem > arr[mid]){
			start = mid+1;
			insertItemInSortedArray(arr, start, end+1, newItem);
		}
		insertItemInSortedArray(arr, start, mid-1, newItem);
	}

	private static int binarySearch(int[] arr, int low, int high, int searchKey) {
		
		int mid = (low+high)/2;
		
		if(searchKey == arr[mid]){
			return mid;
		}
		if(searchKey > arr[mid]){
			return binarySearch(arr, mid+1, high, searchKey);
		}
		return binarySearch(arr, low, mid-1, searchKey);
	}
	

}
