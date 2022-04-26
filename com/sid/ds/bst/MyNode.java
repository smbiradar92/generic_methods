package com.sid.ds.bst;

public class MyNode<K> {

	public MyNode<K> leftNode;
	public MyNode<K> rightNode;
	public K key;
	
	
	public MyNode<K> getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(MyNode<K> leftNode) {
		this.leftNode = leftNode;
	}
	public MyNode<K> getRightNode() {
		return rightNode;
	}
	public void setRightNode(MyNode<K> rightNode) {
		this.rightNode = rightNode;
	}
	@Override
	public String toString() {
		return "MyNode [leftNode=" + leftNode
				+ ", rightNode=" + rightNode + "]";
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
	
	
}
