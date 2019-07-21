package com.test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String name = " ";
		String output =" "; 
		
		Scanner sc = new Scanner(System.in);
		for(int j = 0 ; j<name.length() ; j++) {
			name = sc.next();
		
		
		 for(int i = name.length()-1 ; i >= 0 ; i--) {
			 System.out.print(name.charAt(i) + output); 
		 }}
			 
			}
	}
		                                                    /*for(int i = 0 ; i < 4 ;i++) {
		                                                  	r[x]  = ch[i];
	                                                        x--;*/	 

		
