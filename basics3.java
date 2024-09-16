import java.util.*;

public class basics3{

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
    public static void main(String[] args){
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        //sort in descending order
        Collections.sort(al, getComparator());
        System.out.println(al);
        
    }
}