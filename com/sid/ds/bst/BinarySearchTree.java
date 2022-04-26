package com.sid.ds.bst;

public class BinarySearchTree<K extends Comparable<K>> {
	
	public MyNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);

	}

	public MyNode<K> addRecursively(MyNode<K> current, K key) {
		if (current == null)
			return new MyNode<>();
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		else if (compareResult < 0)
			current.leftNode = addRecursively(current.leftNode, key);
		else {
			current.rightNode = addRecursively(current.rightNode, key);
		}
		return current;
	}

	public int getRecursive(MyNode<K> current) {
		return current == null ? 0 : 1 + this.getRecursive(current.leftNode) + this.getRecursive(current.rightNode);

	}

	public int getSize() {
		return this.getRecursive(root);
	}

	public boolean isPresent(K value) {
		return search(root, value);
	}

	public boolean search(MyNode<K> root, K value) {
		if (root != null && root.key == value) {
			return true;
		}
		if (root == null) {
			return false;
		}
		if (root.key.compareTo(value) < 0) {
			return search(root.rightNode, value);
		} else {
			return search(root.leftNode, value);
		}
	}

}

