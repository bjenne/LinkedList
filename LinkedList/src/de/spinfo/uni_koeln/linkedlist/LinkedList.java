package de.spinfo.uni_koeln.linkedlist;

public class LinkedList {
	
	private Node first;
	
	
	// ADD NEW VALUE TO SORTED LIST
	public void add(int value){
		Node newNode = new Node(value);
		Node currentNode = first;
		
		if (first == null){
			// if list is empty -> new node is first
			first = newNode;
		} else if (first.getValue() > value){
			// if value of first > new value -> new node is first
			newNode.setNext(first);
			first = newNode;
		} else {
			// wie in der Übung...
			while (currentNode.getNext() != null){
				if (currentNode.getNext().getValue() > value){
					newNode.setNext(currentNode.getNext());
					currentNode.setNext(newNode);
					return;
				}
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
	}
	
	
	// PRINT LIST TO CONSOLE
	public void printList(){
		Node currentNode = first;
		long count = 0;
		
		while (currentNode != null){
			System.out.println("[NODE #" + count++ + "]\t" + currentNode.getValue());
			currentNode = currentNode.getNext();
		}
	}

}
