package com.monocept.model;

public class CustomLinkedList {
	private Node head;

	public CustomLinkedList() {
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}

	public void insertHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		head = newNode;
	}

	public void insertAt(int index, int data) {
		Node nodeTobeinserted = new Node(data);
		Node node = head;
		for (int i = 0; i < index - 1; i++) {
			node = node.getNextNode();
		}

		nodeTobeinserted.setNextNode(node.getNextNode());
		node.setNextNode(nodeTobeinserted);
	}

	public void deletenode(int index) {
		Node node = head;
		for (int i = 0; i < index - 1; i++) {
			node = node.getNextNode();
		}

		node.setNextNode(node.getNextNode().getNextNode());
	}


	public void display() {
		if (head != null) {
			Node currentNode = head;
			while (currentNode.getNextNode() != null) {
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNextNode();
			}

			System.out.println(currentNode.getData());
		}
	}

}
