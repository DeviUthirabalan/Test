package com.test;

public class MatchedWords {

	public static void main(String[] args) {
		
		String input1 = "Fi_er";
		String input2 = "Fever:Filter:Filer:Fixer:Fiber:Fibre:tailor:offer";
		
	
		String splitted[] = input2.split(":");
		
		for(int i=0 ; i<splitted.length ; i++) {
		     String output1 = splitted[i];
		
		     
		    	 if( output1.startsWith("Fi") && output1.endsWith("er") 
		    			 && output1.length() == 5){
		    		 
		    		 System.out.print(output1.toUpperCase() + " ");
		    		 
		    	 }
			//else {
				// System.out.println("error");
			
	
		}}}
		 /*char[] array1 = input1.toCharArray();
		
		char arrary2[] ;
		for(int i=0; i<splitted.length; i++) {
			
		    char array2[] = splitted[i].toCharArray();
		    
		    for(int i1=0 ; i1<array1.length ; i1++) {
		   
		
		if(array1[i1] == array2[i1]) {
			String output[] =output[i1]; 
		}}
			String str = array[i1].equals()
			
		for(int i1=0;i1<array1.length;i1++) {
			
		} */
			
		

















	
