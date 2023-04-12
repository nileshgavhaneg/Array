package com.Array.Edubridge;

public class divide_Array {

	public static void main(String[] args) {
		
		int a[]= {9,2,5,1,6,4,2,3,8,6};
		
		int n=a.length;
		int h=n/2;
		//System.out.println(n/2);
		System.out.println(" half array in acending order :");
		for(int i=0;i<h;i++) {
			//System.out.print(a[i]+" ");
			for(int j=i+1;j<h;j++) {
				if(a[i]> a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println("\n half array in decending order :");
		for(int i=h;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.print(+a[i]+" ");
		}
	}

}
