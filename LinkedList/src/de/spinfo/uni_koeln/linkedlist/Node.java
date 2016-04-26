package de.spinfo.uni_koeln.linkedlist;

public class Node {
	
	private int value;
	private Node next;
	
	
	// CONSTRUCTOR
	public Node (int value){
		setValue(value);
	}
	
	
	// GETTERS & SETTERS
	public void setValue(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setNext(Node node){
		next = node;
	}
	
	public Node getNext(){
		return next;
	}

}
