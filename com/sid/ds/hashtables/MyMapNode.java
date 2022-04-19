package com.sid.ds.hashtables;

public class MyMapNode<K, V> implements INode<K> {

	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public K getKey() {
		return key;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setNext(INode<K> next) {
		this.next = (MyMapNode<K, V>) next;

	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public void setNext(MyMapNode<K, V> next) {
		this.next = next;
	}

}
