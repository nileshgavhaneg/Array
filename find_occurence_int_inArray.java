package com.Array.Edubridge;

public class find_occurence_int_inArray {
     
	public static void occurence(int a[] ,int k) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				count++;
				System.out.println("our element occures on ="+i+" index");
			}
		}
		if(count>0) {
			System.out.println("it occures '"+count+" 'times in array");
		}
	}
	
	
	public static void main(String[] args) {
		int[] a= {2,3,4,3,6};
		find_occurence_int_inArray.occurence(a, 3);
	}
}
