 import java.util.*;
 class deque
 {
	 public static void main(String[] args)
	 {
		 Deque<String> deque = new LinkedList<String>();
		 deque.add("Java");
		 deque.addFirst("Python");
		 deque.addLast("Datastructure");
		 deque.push("Web-programming");
		 deque.offer("Networking");
		 deque.offerFirst("DBMS");
		 System.out.println(deque + "\n");
		 deque.removeFirst();
		 deque.removeLast();
		 System.out.println("Deque after removing " + "first and last: " + deque);
	}
}
