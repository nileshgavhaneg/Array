package com.Array;

public class pallendrome {

	public static boolean checkPallendrome(String s) {
		
		char c[]=s.toCharArray();
		int start=0;
		int end=c.length-1;
		
		while(start < end) {
			if(c[start]==c[end]) {
				
			return true;
			}
			start++;
			end--;
		} 	 	
		return false;
	}
	
	public static void main(String[] args) {
		String s="nilesh";
		
	if(pallendrome.checkPallendrome(s)) {
		System.out.println("pallendrome");
	}else {
			System.out.println("not pallendrome");
		}
	}}	