package com.Array.Edubridge;

public class Find_max_between_its_Neigbors {

	public static void main(String[] args) {
		int a[]= {10, 20, 15, 2, 23, 90, 67};
		boolean flag=true;
		int peak=0;
		int i,j,k;
		int n=a.length-1;
		for( i=1;i<a.length;i++) {
			for( j=i-1;j<a.length;j++) {
				for( k=i+1;k<a.length;k++) {
					
					if(a[i]==n) {
						
						if(a[i]>a[j]) 
							
							peak=a[i];
						
					}else if(a[i]==a[0]) {
						if(a[i]>a[k])
							peak=a[i];
					}
					
					
					
					else
					if(a[i]>a[j] && a[i]>a[k]) {
						peak=a[i];
						
					
					}
				}
			
				}
			
				
			}
		System.out.println(peak);
		}

	}


