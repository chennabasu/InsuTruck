package com.oops.test;

import java.util.ArrayList;
import java.util.List;

public class TestOops {
	
	public static void main(String args[]) {
		
		List<String> lst = new ArrayList<String>();
		lst.add("sujatha");
		lst.add("chenna");
		lst.add("kavi");
		
		for (String st : lst) {
			
			System.out.println(st);
			
		}
	}

}
