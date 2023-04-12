package com.Array.Edubridge;

import java.util.Arrays;

public class move_0s_1s_and_2s {
	
	static int temp=0;
	public static void reverse(int a[]) {
		int i=0,j=0,k=a.length-1;
		while(i<=k) {
			if(a[i]==0) {
				swap(a, i, j);
				i++;
				j++;
			}else if(a[i]==1) {
				
				i++;
			} else  {
				swap(a,i,k);
				k--;
			}
			
		}
		print(a);
		}
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
    }
	}
	
	public static void swap(int a[],int i,int j ) {
		 
		
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	public static void main(String[] args) {
		
		int a[]= {2,0,1,0,2,2,0,1};
		
		
		move_0s_1s_and_2s.reverse(a);
		
		
	
			
		
        
		}
	
}
