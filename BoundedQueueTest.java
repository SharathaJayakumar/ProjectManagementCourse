import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;
import org.junit.Test; // for @Test
import org.junit.Before; // for @Before

public class BoundedQueueTest {
      //Tests for the class BoundedQueue
	private BoundedQueue queue;

	@Before
	public void setUp() {
		this.queue = new BoundedQueue(3);
	}
	
	@Test
	public void testEmptyQueue() {
		Assert.assertTrue(this.queue.isEmpty());
	}
	
	@Test
	public void testEnqueue() {
		String newString = "This is the first String";
		this.queue.enQueue(newString);
		Assert.assertFalse(queue.isEmpty());
	}
	
	@Test
	public void testDequeue() {
		String newElement = "This is first String";
		this.queue.enQueue(newString);
		Assert.assertEquals(newString, this.queue.deQueue());
                     
	}
	
	@Test
	public void testIsQueueFull() {
		String s1, s2, s3;
		s1 = "This is first string";
		s2 = "This is second string";
		s3 = "This is third string";
		
		this.queue.enQueue(s1);
		this.queue.enQueue(s2);
		Assert.assertFalse(this.queue.isFull());
		
		this.queue.enQueue(s3);
		Assert.assertTrue(this.queue.isFull());
		System.out.println(this.queue);
	}
	
	@Test
	public void testToString() {
		String s1, s2, s3;
		s1 = "This is first string";
		s2 = "This is second string";
		s3 = "This is third string";
		
		this.queue.enQueue(s1);
		this.queue.enQueue(s2);
		this.queue.enQueue(s3);
		
		Assert.assertEquals("[This is first string, This is second string, This is third string]", this.queue.toString());
	}
}
