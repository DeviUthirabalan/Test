package com.test;

import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		
		Date  dt = new Date();
		
		System.out.println(dt.getMonth()+" "+
		dt.getDate()+" "+
		dt.getDay()+" "+
		dt.getHours()+" "+
		dt.getMinutes()+" "+
		dt.getSeconds());
		
		System.out.println(dt.getTime());

	}

}
