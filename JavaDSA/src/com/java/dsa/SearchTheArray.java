package com.java.dsa;

import java.util.Iterator;

public class SearchTheArray {
	public static int twoSum() {
		
		return -1;
	}
	public static void main(String[] args) {
		int nums[] = { 21, 25, 31, 15, 45, 6, 96, 87 };
		int target = 60;
		int ans=linearSearch(nums, target);
		System.out.println(ans);
		int ans2=linearSearch(nums, target);
		System.out.println(ans2);
		
		twoSum();
	}

	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}
		return -1;

	}
	
	static int linearSearch2(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int element : arr) {
			//int element = arr[index];
			if (element == target) {
				return element;
			}
		}
		return -1;

	}
	
	public int twoSum1() {
		int nu[] = { 3, 6, 7, 8, 4 };
		int target = 15;
		// output =[2,3]
		int size = nu.length;
		for (int i = 0; i <= size - 1; i++) {
			for (int j = i; j <= size - 1; j++) {
				int n2 = nu[i] + nu[j + 1];
				if (n2 == target) {
					return j;
				}
				//return -1;
			}
			//return -1;
		}
		System.out.println("Index");
		return -1;
	}
	
}
