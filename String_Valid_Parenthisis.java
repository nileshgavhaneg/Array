package com.Array;
import java.util.Stack;
public class String_Valid_Parenthisis {
	
	public static void isValid(String s) {
		
		Stack<Character> stack=new Stack<Character>();
		
//		char c[]=s.toCharArray();
		char top = 0;
		for(char ch:s.toCharArray()) {
			if(ch=='{' || ch=='[' || ch=='(') 
				stack.push(ch);
			else 
				if(stack.isEmpty())
				System.out.println("invalid");
			 else 
			 top =stack.peek();
				if(ch=='}' && top=='{' || 
						ch==']' && top=='[' ||
						ch==')' && top=='(') 
					stack.pop();
				else 
					if(stack.isEmpty())
					System.out.println("invalid paranthis");
				}
			
				if(stack.isEmpty()) {
					System.out.println("valid paranthisis");
				}else {
					System.out.println("invalid parantjisis further.....");
				}
				
		
		
		
		
	}


	public static void main(String[] args) {
		
		
		String s="{[]}";
		String_Valid_Parenthisis.isValid(s);
		
//		String s="{}]";
//		int count=0;
//		
//		boolean matching=true;
//		char c[]=s.toCharArray();
//		
//		int chlength=c.length/2;
//		int remaininglength=c.length-chlength;
//		char ch [] =new char [chlength] ;
//		for(int j=chlength+1;j<c.length;j++) {
//		for(int i=0;i<c.length/2;i++) {
//			if(c[i]=='{'||c[i]=='('|| c[i]=='[' && c[j]=='}' || c[j]==']' || c[j]=='}' && chlength==remaininglength) {
//				
//				matching=true;
//			}else {
//				matching=false;
//			}
//			
//		}
//		if(matching) {
//			System.out.println("valid");
//		}else {
//			System.out.println("not valid");
//		}
//		
//		}}}

	}}
