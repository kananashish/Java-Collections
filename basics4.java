import java.util.*;
public class basics4 {
   public static void main(String[] args) {
    //min heap 
    //returns the minimum element when you poll the top element
    Queue<Integer> pq = new PriorityQueue<>();
    pq.add(1);
    pq.add(5);
    pq.add(3);
    System.out.println(pq.poll());
   } 
}
