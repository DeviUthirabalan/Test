package com.test;

import java.util.Scanner;

public class UpperToLowerCase {

	public static void main(String[] args) {
		//char name[]=new char[25];
		String output = null;
		int ascii = 0;
		
		Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	
		char[] ch1 = input.toCharArray();
		
		for(int i  = 0 ; i < ch1.length; i++) {
			
	    ascii  = (int) ch1[i];
		
	    //System.out.println(ascii);
	    
	    for(int i1 = 0 ; i1<ch1.length ;i1++) {
	if(ascii >= 65 && ascii <=90) {
        ascii =  (char)( ascii + 32 ) ;
   //  System.out.print(out);     
	}
	else {
		ascii =  ascii;
	}
	    
	}
	 char str = (char) ascii ;
			
	System.out.print(str + " ");
	}}}









/* if(ascii >= 65) {
	    	char[] lCaseAscii =(char) (ascii + 32);
	    	System.out.println();
	}    	}
	    
	   // do {
	    	ascii = ascii + 32 ;
	    while(ascii >= 65) {	
	    }*/
	  
	    
	    
		
	
	
	
