package sampleQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class QueueTest {

	/**
	 * Tests for Queue.
	 */

	private static final String SOME_ITEM = "some-content";
	private Queue<String> q;


	@Test
	@Disabled
	@DisplayName("is instantiated with new Queue()")
	void isInstantiatedWithNew() {
		new Queue<>();
	}

	@BeforeEach
	void init() {
		this.q = new Queue<String>();
	}

	@Test
	@DisplayName("Verify Queue isEmpty when queue is initialized")
	void isEmptyShouldGiveTrueOnQueueInit() {
		assertTrue(q.isEmpty());
	}

	//Example of Wrong Test! 
	@Test
	@DisplayName("Verify Queue isEmpty returns false when queue is not empty")
	void isEmptyShouldGiveFalseWhenQueueIsNotEmpty() {
		this.q.enqueue("hi");
		assertTrue(q.isEmpty());
	}
	
	@Test
	@DisplayName("test to add elements")
	public void enqueue() {

		q.enqueue("hi");
		
		//Object i = q.dequeue();
		assertEquals("hi ",q.toString());
	}
	
	@Test
	@DisplayName("test to remove an element")
	public void dequeue() {
		
		q.enqueue("hi");
		q.enqueue("hey");
		Object i = q.dequeue();
		assertEquals("hey ",q.toString());
	
	}
	@Test
	@DisplayName("test for peek")
	public void Peek() {
	

        q.enqueue("hi");
        assertEquals(q.peek(), "hi");

	}
	
	@Test
	@DisplayName("test for checking length")
	public void length() {
		
		q.enqueue("hi");
		q.enqueue("TA");
		assertTrue(q.size() == 2);
	}
	
	@Test
	@DisplayName("test it is empty")
	public void Empty() {
		q.enqueue("hey");
		q.enqueue("man");
		Object i = q.dequeue();
		Object j = q.dequeue();
		assertTrue(q.isEmpty());
	}
	
	@Test
	@DisplayName("test to remove all elements")
	public void removeall() {
		q.enqueue("hey");
		q.enqueue("man");
		q.removeAll();
		assertTrue(q.isEmpty());
	}
	
}