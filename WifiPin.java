package com.test;

import java.util.Scanner;

public class WifiPin {

	public static void main(String[] args) {
		
	  String firstName =" ";
	  String lastName =" ";
	  int roomNum    = 0;
	  char[] spl ={'!','@','#','$','%','^','&','*','(',')'};
	  
	  Scanner sc = new Scanner(System.in);
	  
	  
		firstName =  sc.next();
		lastName  =  sc.next();
		roomNum   =  sc.nextInt();
	 /*   int  rn   = ((roomNum /10) % 10);
        int splChar =  ((roomNum /10) /10);  
	  System.out.println(firstName.charAt(firstName.length()-1)
	  + " " + lastName.charAt(0) + " "+rn + " " + spl[splChar]);*/
	

System.out.println(firstName.charAt(firstName.length()-1)
		+ " " + lastName.charAt(0) + " "+((roomNum /10) % 10) 
		+ " " + spl[((roomNum /10) /10)]);
}}