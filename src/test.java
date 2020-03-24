
public class test {
 
	public static void main (String[] args) {
		 ArrayBasedDeque<Integer> s1 = new ArrayBasedDeque<Integer>();
		 System.out.println("Deque before adding anything:"+ s1);	 
		 System.out.println(s1.isEmpty());  //To check if IsEmpty() works
		 
		 s1.addLast(24);
		 s1.addLast(23);
		 s1.addFirst(9);
		 s1.addFirst(45);
		 System.out.println("Deque:"+s1.toString());
		 System.out.println("First Item:"+s1.getFirst());
		 System.out.println("Last Item: "+ s1.getLast());
		 
		 s1.addFirst(1);
		 s1.addLast(3);
		 s1.addLast(232);
		 s1.addFirst(24);
		 s1.addFirst(64);
		 s1.addFirst(98);
		 System.out.println("Deque with 10 items:"+ s1.toString());
		 System.out.println("Size of deque:"+ s1.size());
		 
		 //Since the size of the queue has reached the maximum limit, lets test if the deque is Dynamic 
		 
		 s1.addFirst(989);
		 
		 //Lets test if the expand() method worked or not
		 
		 System.out.println("Deque with 11 items:"+ s1.toString());
		 System.out.println("Size of deque:"+ s1.size());
		 
		 //Testing removing the first element from deque method
		 s1.removeFirst();
		 System.out.println("Deque after removing first:"+ s1.toString());
		 
		 //Testing the last method from the deque method
		 s1.removeLast();
		 System.out.println("Deque after removing last:"+s1.toString());
		 
		//To re-check isempty() method
		 System.out.println(s1.isEmpty()); 
		 
		 //Test the get(index) method
		 System.out.println("Get element on index 3 of deque:"+s1.get(2));

	}
}
