package com.sid.ds.stack;

public class MyStack<K> {

	MyLinkedList<K> list;

	public MyStack() {
		list = new MyLinkedList<>();
	}

	public boolean push(K item) {
		INode<K> node = new MyNode<>(item);
		return list.addFirst(node);
	}

	public K pop() {
		INode<K> popNode = list.pop();
		return popNode.getKey();
	}

	public boolean isEmpty() {
		return list.size() == 0;
	}

	public int size() {
		return list.size();
	}

	public K peek() {
		return list.head.getKey();
	}

	@Override
	public String toString() {
		return "MyStack [list=" + list + "]";
	}
	
}
