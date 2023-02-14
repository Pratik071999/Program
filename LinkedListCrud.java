package com.monocept.model;

import java.util.LinkedList;

public class LinkedListCrud {

	public static void main(String[] args) {
		LinkedList<Object> list=new LinkedList<Object>();
		//adding element
		list.add("Praik");
		list.add("Nihit");
		list.add("Shlok");
		
		System.out.println("After adding elements: "+list);
		
		//updating element
		list.set(1, "ABC");
		System.out.println("After updating elements: "+list);
		
		//retrieving element
		System.out.println("After retrieving element: "+list.get(1));
		
		//deleting element
		list.remove(2);
		System.out.println("After removing element: "+list);
		
		

	}

}
