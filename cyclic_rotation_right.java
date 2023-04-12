package com.Array.Edubridge;

import java.util.Arrays;

public class cyclic_rotation_right {

	public static void main(String[] args) {
		int a[]= {1,8,96,10,9,4,3,5};
		
		int first=0;
		
		first=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		
      a[a.length-1]=first;
      System.out.println(Arrays.toString(a));
	}
	
		
}
