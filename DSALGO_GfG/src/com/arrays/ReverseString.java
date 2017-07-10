package com.arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		int arr[] = { 1,2,3,4,5,6,7,8,9 };
		int length = arr.length;
		int mid = length / 2;
		int[] reverse = reverse(arr, 0, length - 1, mid);
		System.out.println(reverse);

	}

	private static int[] reverse(int[] arr, int low, int high, int mid) {
		int temp = 0;
		if (low < mid) {
			
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
			reverse(arr, low, high, mid);
		}
		return arr;
	}

}
