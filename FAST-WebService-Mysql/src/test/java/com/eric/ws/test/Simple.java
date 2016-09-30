package com.eric.ws.test;

public class Simple {

	public static void main(String[] args) {
		String s = "grogol (Gondang Wetan)";
		String filterKey = s.substring(s.indexOf('(')+1, s.length()-1).trim();
		
		System.out.println(filterKey);
	}
}
