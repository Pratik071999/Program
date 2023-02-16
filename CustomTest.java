package com.monocept.test;

import com.monocept.model.CustomLinkedList;

public class CustomTest {

	public static void main(String[] args) {
		CustomLinkedList cll=new CustomLinkedList();
		
		//adding element 
		cll.insert(5);
		cll.insert(10);
		cll.insert(15);
		cll.insert(20);
		cll.display();
		System.out.println("-----------------");
		
		//adding element at particular position
		cll.insertAt(1, 12);
		
		//displaying list
		cll.display();
		System.out.println("-----------------");
		
		//deleting element from position
		cll.deletenode(1);
		cll.display();
		System.out.println("-----------------");
		
		//inserting at head
		cll.insertHead(2);
		cll.display();

	}

}
