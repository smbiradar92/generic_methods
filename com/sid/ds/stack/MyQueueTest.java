package com.sid.ds.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyQueueTest {

	@Test
	public void enqueueTest() {
		MyQueue<Integer> queue = new MyQueue<>();

		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);

		System.out.println(queue);
		System.out.println(queue.enqueue(56));
		assertEquals(true, queue.enqueue(56));

	}

	public void dequeueTest() {
		MyQueue<Integer> queue = new MyQueue<>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);

		System.out.println(queue);
		System.out.println(queue.dequeue());
		assertEquals(56, queue.dequeue());

	}

}
