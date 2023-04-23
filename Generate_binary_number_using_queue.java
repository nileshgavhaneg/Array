package com.Array;

import java.util.LinkedList;
import java.util.Queue;

public class Generate_binary_number_using_queue {
     
//	input :n=4                 1,  2,   3  ,  4  , 5
//	output: binary numbers : "1","10","11","100","101"
	public static String[] convert_Binary(int n) {
		String result[]=new String[n];
		Queue <String> q=new LinkedList<>();
		
		q.offer("1");
		for(int i=0;i<n;i++) {
			
			result[i]=q.poll();
			String n1=result[i]+"0";
			String n2=result[i]+"1";
			
			q.offer(n1);
			q.offer(n2);
			
		}
		
		return result;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int n=4;
		
	String []r=	Generate_binary_number_using_queue.convert_Binary(n);
            for(int i=0;i<n;i++) {
            	System.out.print(r[i]+" ");
            }
	}

}
