import java.util.*;
public class basics2 {
    public static void main(String[] args){
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        //sort in descending order
        //[num1,num2]
        //num1 < num2 -> wrong order TiT swap and return postive
        //num1 > num2 -> correct order TiT no change and return negative
        Collections.sort(al, (num1,num2) -> num2 - num1);
        System.out.println(al);
        
    }
}
