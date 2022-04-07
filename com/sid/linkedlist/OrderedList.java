package com.sid.linkedlist;

public interface OrderedList<K> {

	public void add(K item);
	
	public void remove(K item);
	
	public boolean search(K item);
	
	public boolean isEmpty(K item);
	
	public int size();
	
	public int index(K item);
	
	public K pop();
	
	public K pop(int pos);
}
