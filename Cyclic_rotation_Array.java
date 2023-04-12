package com.Array.Edubridge;

import java.util.Arrays;

public class Cyclic_rotation_Array {
    
	
	
	public static void main(String[] args) {
		
		int i,j;
     int a[]= {1,2,3,4,5};
     int last=a[a.length-1];
    for(i=a.length-1;i>0;i--) {
    	a[i]=a[i-1];
    
   	}
    a[0]=last;
    for(j=0;j<a.length;j++) {
    	System.out.print(a[j]+" ");
    }
    System.out.println(Arrays.toString(a));
    
	}
}
