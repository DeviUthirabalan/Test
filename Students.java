package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Students {
	
	public static void main(String[] args) {
		String names;
		
		/*Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
		names = sc.next();
		*/
		
		Set<String> set = new <String>HashSet();
		//set.add(names);
		
		set.add("Devi");
		set.add("Shree");
		set.add("Angel");
		set.add("Devi");
		set.add("Princess");
		 
	    Iterator iterator = set.iterator();
		
	    while(iterator.hasNext()) {
		
           System.out.println(iterator.next());
          }
	    }}