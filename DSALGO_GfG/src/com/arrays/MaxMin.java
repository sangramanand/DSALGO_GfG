package com.arrays;

public class MaxMin {

	public static void main(String[] args) {

		int arr[] = { 1000, 11, 445, 1, 330, 3000,0 };
//		findMaxMinSimpleLinerSearch(arr);
		findMaxMinInPairs(arr);
	}

	private static void findMaxMinSimpleLinerSearch(int[] arr) {

		// METHOD 1 (Simple Linear Search) - Time Complexity: O(n)

		Integer max = 0;
		Integer min = 0;

		if (arr.length == 1) {
			max = arr[0];
			min = arr[0];
		}
		if (arr[0] > arr[1]) {
			max = arr[0];
			min = arr[1];
		} else {
			max = arr[1];
			min = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {

			if (arr[i] < min)
				min = arr[i];
			if (arr[i] > max)
				max = arr[i];
		}

		System.out.println("Max number is : " + max);
		System.out.println("Min number is : " + min);
	}

	private static void findMaxMinInPairs(int[] arr) {

		int length = arr.length;
		int max = 0;
		int min = 0;
		int counter = 0;

		if (length % 2 == 0) {
			if (arr[0] > arr[1]) {
				max = arr[0];
				min = arr[1];
			} else {
				max = arr[1];
				min = arr[0];
			}
			counter = 2;
		} else {
			max = arr[0];
			min = arr[0];
			counter = 1;
		}

		while (counter < length) {
			if (arr[counter] > arr[counter + 1]) {
				if (arr[counter] > max)
					max = arr[counter];
				if (arr[counter + 1] < min)
					min = arr[counter + 1];

			} else {
				if (arr[counter + 1] > max)
					max = arr[counter + 1];
				if (arr[counter] < min)
					min = arr[counter];
			}
			counter+=2;
		}

		System.out.println("Max number is : " + max);
		System.out.println("Min number is : " + min);

	}

}
