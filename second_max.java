package com.Array;

import java.time.chrono.MinguoChronology;

public class second_max {

	public static int Second_Max(int []a) {
		
		int max=Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				second_max=max;
				max=a[i];
			}else if(a[i]>second_max && a[i]!=max) {
				second_max=a[i];
			
			}
		}
		return second_max;
		
	}
	
	
	public static void main(String[] args) {
	int a[]={2,34,45,3,13,41};
        System.out.println(second_max.Second_Max(a));
	}

}
