package com.sid.ds.stackque;

public interface UnOrderedList<K> {

	public void add(K item);
	
	public void remove(K item);
	
	public boolean search(K item);
	
	public boolean isEmpty(K item);
	
	
	public int size();
	
	public int index(K item);
	
	public K pop();
	
	public K pop(int pos);

	public void append(K item);

	public void insert(int pos, K item);

	boolean isEmpty();
}
