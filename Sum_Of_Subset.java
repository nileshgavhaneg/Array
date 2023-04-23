package com.Array;

public class Sum_Of_Subset {
	public static int Max_subset_array_of_three(int a[],int k) {
		
		int window_sum=0;
		int max_sum=0;
		
		int start=0;
		
		for(int end=0;end<a.length;end++) {
			window_sum +=a[end];
			
			if(end >=k-1) {
				max_sum=Math.max(max_sum, window_sum);
				
				window_sum=window_sum - a[start];
				start++;
			}
		}
		
		return max_sum;
		
	}
	
	public static void main(String[] args) {
	  
	int a[]= {2,3,4,3,5,8,9};
	int k=3;
	System.out.println("max sum of 3 sets in array :"+Sum_Of_Subset.Max_subset_array_of_three(a, k));
	 
	}
}
