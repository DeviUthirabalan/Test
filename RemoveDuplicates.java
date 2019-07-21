package com.test;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int y = 0;
		int x = 0;
	    int count = 0;
		int num[] = new int[] {1,2,3,3,4,4,5,7,3};
		int arr[] =  new int[num.length];
		for(int i=0 ; i < num.length ; i++) {
			
			for(int j =0 ; j < num.length ; j++) {
			if(num[i] == num[j]) {
			//System.out.println(num[i]);
		    count++; 
			}}	
                 if(count == 1) {
				   arr[x] = num[i]; 
				   x++;
                 }else {
					for(int i1 =0 ; i1<arr.length ;i1++) {
                		if( arr[i1] == num [i]) {
                		y++;
                		}
                		}
                		if(y == 0) {
                			arr[x] = num[i];
                			x++;	
                		}y =0;	
                 }count = 0;
		}  
                 for(int i =0 ; i< arr.length ;i++) {
                 System.out.println(arr[i]); 
		}
	 
	 }}









/*	if(name[i].equals( name [i] + 1)) {
		// output = name[i];
	   System.out.println(name[i]);
	}
	//output = null;	 
}*/

