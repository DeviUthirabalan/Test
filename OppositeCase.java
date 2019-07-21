package com.test;

import java.util.Scanner;

public class OppositeCase {

	public static void main(String[] args) {
		
		//char name[] = new char[25];
		String name;
        String finalOutput;
	Scanner sc = new Scanner(System.in);
		String output = sc.next();
		
		//char[] output1 = output.toCharArray();
		
		for(int i = 0 ; i < output.length() ; i++) {
			
			if( ((int)output.charAt(i)) >= 65 && (int)output.charAt(i) <=90) {
				 finalOutput =((char)((int)output.charAt(i) + 32)) + " ";
				//System.out.print(finalOutput + " ");
			}else {
			 finalOutput =((char) ((int)output.charAt(i) - 32)) +" ";
			//System.out.print(finalOutput + " ");
			
		}
			System.out.print(finalOutput +" " );
			}
	}
}

	

