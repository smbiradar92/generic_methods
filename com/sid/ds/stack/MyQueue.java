package com.sid.ds.stack;

public class MyQueue<K> {

	MyLinkedList<K> list;

	public MyQueue() {
		list = new MyLinkedList<>();
	}

	public boolean enqueue(K item) {
		INode<K> node = new MyNode<>(item);
		return list.append(node);
	}

	public K dequeue() {
		return list.pop().getKey();
	}

}
