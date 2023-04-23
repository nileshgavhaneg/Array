package com.Array;

public class Kedans_Algo {
	
	public static int Maxsum_Subset(int a[]) {
		
		int current_Max=a[0];
		int max_Sofar=a[0];
		
		
		for(int i=1;i<a.length;i++) {
			current_Max=current_Max + a[i];
			if(current_Max < a[i]) {
				
				current_Max=a[i];
			}
			if(current_Max > max_Sofar) {
				max_Sofar=current_Max;
			}
		}
		
		
		return max_Sofar;
		
	}

	public static void main(String[] args) {
		int a[]= {4,3,-2,6,-12,7,-1,6};
		
		System.out.println(Kedans_Algo.Maxsum_Subset(a));
	}

}
