import java.util.*;
public class basics5 {

    public static Comparator<Integer> getComparator(){
        return new Comparator<Integer>() {
            //[num1,num2]
            @Override
            public int compare(Integer num1, Integer num2){
                //num1 < num2
                //order is wrong
                if(num1 < num2){
                    return 1;
                }
                else if(num1 > num2){
                    return -1;
                }
                return 0;
            }
        };
    }
   public static void main(String[] args) {
    //max heap 
    //returns the maximum element when you poll the top element
    Queue<Integer> pq = new PriorityQueue<>(getComparator());
    pq.add(1);
    pq.add(5);
    pq.add(3);
    System.out.println(pq.poll());
   } 
}
