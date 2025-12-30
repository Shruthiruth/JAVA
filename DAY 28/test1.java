import java.util.*;

// collections = utility class
// collection framework
// collection = interface
class test1{
    public static void main(String[] args) {
        LinkedList<Integer> uids =new LinkedList<>( Arrays.asList(10,20,30,40));
        ArrayList<Integer> eids = new ArrayList<>(Arrays.asList(10,20,30,40));

        eids.add(50); // adding the element at the end of array
        eids.set(0, 5);  // adding the element at the begining of the list
        System.out.println(eids);
        uids.addFirst(5);  // this method comes from dequeue methods,add the element at the begining of the list
        System.out.println(uids);
    }
}