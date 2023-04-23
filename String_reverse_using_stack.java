package com.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
public class String_reverse_using_stack {

	
	public static String ReverseString(String str) {
		
		Stack <Character> n=new Stack<>();
		char c[]=str.toCharArray();
		
		for(char r :c) {
			n.push(r);
		}
		for(int i=0;i<str.length();i++) {
			c[i]=n.pop();
		}
		
		return new String(c);
		
		
	}
	
	public static void main(String[] args) {
	     
		String str ="nilesh";
		  
		System.out.println(String_reverse_using_stack.ReverseString(str));
		
		int n=15;
		   
		   
		        for(int i=1;i<=n;i++) {
		            if(i%3==0)
		                System.out.println("Fizz");
		            else if(i%5==0)
		                System.out.println("Buzz");
		            else if(i%3==0 && i%5==0)
		                System.out.println("FizzBuzz");
		            else
		            	System.out.println(i);
		        
		    }
	}
	}
