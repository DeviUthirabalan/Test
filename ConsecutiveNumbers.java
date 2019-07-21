package com.test;

import java.util.Scanner;

public class ConsecutiveNumbers {
	public static void main(String agrs[]) {
		int count1 = 0;
		
		Scanner sc  = new Scanner(System.in);
			 int n = sc.nextInt();
			 int nums[] = new int[n];
			 
			 for(int i=0 ; i < n ; i++) {
				 
				 nums[i] =  sc.nextInt();
			 }
			/* for (int i = 0; i < nums.length; i++) {
				 System.out.print(nums[i]);
			 }*/
				
			

		    for(int i1=0 ; i1 < nums.length-2  ; i1++) 
		    {
		
			if((nums[i1+1] == nums[i1]+1) && (nums[i1+2] == (nums[i1] + 2))) {
				  count1++ ;	
			}     
		}
        System.out.println(count1);	
} }
