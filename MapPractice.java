package com.akhil.practice.java8;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Character, String> charType = new HashMap<Character, String>();

		charType.put('A', "Apple");
		charType.put('B', "Basketball");
		charType.put('C', "Cat");
		charType.put('D', "Dog");
		
		charType.forEach((k,v) -> System.out.println(k +" " + v + " "));
		charType.entrySet().forEach(input -> System.out.println(input.getKey() + "" + input.getValue()));

	}

}
