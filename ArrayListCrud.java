package com.monocept.model;

import java.util.ArrayList;

public class ArrayListCrud {

	public static void main(String[] args) {
		    // create an ArrayList
		    ArrayList<String> list = new ArrayList<>();
		    
		    // add items to the list
		    list.add("Apple");
		    list.add("Banana");
		    list.add("Cherry");
		    
		    // print the list
		    System.out.println("Initial list: " + list);
		    
		    // CRUD operations
		    // add an item
		    list.add("Pineapple");
		    System.out.println("After add: " + list);
		    
		    // update an item
		    list.set(1, "Grapes");
		    System.out.println("After update: " + list);
		    
		    // retrieve an item
		    String item = list.get(2);
		    System.out.println("Retrieved item: " + item);
		    
		    // remove/delete an item
		    list.remove(0);
		    System.out.println("After deleting: " + list);
		    
		    // check if an item exists
		    boolean exists = list.contains("Cherry");
		    System.out.println("Does Cherry exist? " + exists);
		}


	}
