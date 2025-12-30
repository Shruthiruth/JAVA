import java.util.Arrays;
import java.util.*;

public class test3 {
    public static void main(String[] args) {
       List <Integer>eids= new LinkedList<Integer>(Arrays.asList(101,102,103,104));

       // iterate using for loop
       // iterate using while loop and do while loop
       // iterate using foreach
       // iterate using iterate() methhod

       Iterator itr = eids.iterator();
       while (itr.hasNext()) {
        System.out.println(itr.next());
        
       }
    }    
}
