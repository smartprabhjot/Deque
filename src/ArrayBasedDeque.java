import java.util.NoSuchElementException;

public class ArrayBasedDeque<AnyType> {
	
	private AnyType[] items;
	private static int MAX_SIZE=10;
	private int front, rear, count;
	
	
	/**
	 * ArrayBasedDeque() constructs empty Deque
	 */
	
	public ArrayBasedDeque() {
		items = (AnyType[])(new Object[MAX_SIZE]);
		front = 1;
		rear = 1;
		count = 0;
	}
	
	/**
	 * 
	 * @return the number of items in this deque
	 */
	public int size() {
		return count;
		
	}
	
	/**
	 * Tests if the Deque contains no element 
	 * @return true if the Deque contains no element
	 */
	public boolean isEmpty() {
		return count == 0;
	}
	
	/**
	 * An Internal method to expand the size of the array items
	 * Allocates a new array, twice as long
	 * Updates the MAX_LIST
	 * method similar to expand() in ArrayBasedList() 	
	 */
	private void expand() {
		AnyType[] newItems = (AnyType[]) (new Object[MAX_SIZE*2]) ;
		for(int i=0;i<=count;i++) {
			newItems[i]=items[front];
			front = (front+1) % MAX_SIZE;	
			
		}
		
		MAX_SIZE *=2; 
		front = 1;
		rear = 0;
		items = newItems;
		
	}
/**
 * Adds an object of type Anytype to the front of Deque
 * @param x an AnyType value to be added to the Deque
 * @throws IndexOutOfBoundsException if front is not between 0 and size()
 */
	public void addFirst(AnyType x)  {
		
	
		if (size() == MAX_SIZE) 
			expand();
		
	    front = (MAX_SIZE-1+ front)% MAX_SIZE;
		items[front]=x;	
		count++;  }
	
/**
 * @return item at the front of the deque. 
 * @throws NoSuchElementException If no such item exists.
 */
	
	public AnyType getFirst() throws NoSuchElementException{
		if(isEmpty()) throw new NoSuchElementException();
		return items[front];
	}
	

	/**
	 * Add an object to the rear of the deque
	 * @param x is an object of type AnyType)
	 */
	public void addLast(AnyType x) {
		if (size() == MAX_SIZE) 
			expand();  
		  rear = rear % MAX_SIZE; 
		  items[rear++]= x;
		  count++; 
	
	}
	
	/**
	 * Get the item at the rear of the deque.
	 * @return item at the rear of the deque
	 * @throws NoSuchElementException  if no such item exists.
	 */
	
	public AnyType getLast() throws NoSuchElementException{
		if(isEmpty()) throw new NoSuchElementException();
		return items[rear-1];
	}
	
	/**
	 * Get the item at the given index where 0 is the front, 1 is the next item, and so forth. 
	 * @param index 
	 * @return item at given index
	 * @throws IndexOutOfBoundsException if no such index exists
	 */
	public AnyType get(int index) throws IndexOutOfBoundsException{
		AnyType result=null;
		
		for(int i=front;i<=size();i++) {
			if(items[i]==items[index]) {
				result=items[i];
			}
		}
		return result;
		
	

	}
	
	
	/**
	 * Remove and return the item at the front of the deque.
	 * @return Item from the front of deque.
	 * @throws NoSuchElementException  If no such item exists.
	 */
	
	public AnyType removeFirst() throws NoSuchElementException {
		if(isEmpty()) 
			throw new NoSuchElementException();
		AnyType x = items[front];
		front = (front+1) % items.length;
		count--;
		return x;
		
	}
	
	/**
	 * Remove and return the item at the rear of the deque
	 * @return Item from the rear of deque.
	 * @throws NoSuchElementException  if no such item exists.
	 */
	
	public AnyType removeLast() throws NoSuchElementException{
		if (isEmpty()) 
			throw new NoSuchElementException();
		
		AnyType x = items[rear];
		rear = (rear + items.length)% items.length;
		count--;
		return x;
	}
	
	/**
	 * Method returns the String representation of Deque Object
	 */

	public String toString() {
		int ind, i;
		AnyType obj;
		String result = "[ ";
		  
        ind = front;
        i = 0;
		while (i < count) {
		    obj = items[ind];
		    result = result + obj.toString() + "  ";
		    i++;
		    ind = (ind+1) % MAX_SIZE;
		}
		result = result + "]";
		return result;
	}
	
	

}
