package com.Array;

public class put_Zeros_last_of_Array {
   
	public static void zeros_At_Last(int a[]) {
		
		for(int i=0 ;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==0 && a[j]!=0 ) {
					
					
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
				
		}
			
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		
		int a[]= {3,0,9,5,0,2};
	put_Zeros_last_of_Array.zeros_At_Last(a);

	}

}
