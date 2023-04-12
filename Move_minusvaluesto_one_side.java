package com.Array.Edubridge;

import java.util.Arrays;

public class Move_minusvaluesto_one_side {
	
	public static void move_one_side(int a[]) {
		
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
	        for(int j=i+1;j<a.length;j++) {
	        	if(a[i]<0 && !(j  < 0)) {
	        		 temp=a[i];
	        		 a[i]=a[j];
	        		 a[j]=temp;
	        	}
	        }
	       
			
	        System.out.print(a[i]+" ");
	}
		
		
		
	}
	
	public static void main(String[] args) {
		 
		int a[]= {3,4,5,6,-1,7,-5,10,-8};
		
		Move_minusvaluesto_one_side.move_one_side(a);
		
	}

}
