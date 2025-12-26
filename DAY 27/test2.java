

// hasNext() = it is Iterator interface method, it will check if the value is there then return true
// Next() = it will check the values if there is not then it return false

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class test2 {

    public static void main(String[] args) {
            ArrayList <String>enames = new ArrayList<String>();
        System.out.println(enames);
        enames.add("Rahul Gandhi");
        enames.add("Sonia Gandhi");
        enames.add("Priyanka Gandhi");
        enames.add("Kalai");
        enames.add("Ajith");
        enames.add("Vijay");
        enames.add("siva");
        enames.add("Modi");
        
        Iterator itr = enames.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }

        Collections.sort(enames);
        System.out.println(enames);
        Collections.sort(enames,Collections.reverseOrder());
        System.out.println(enames);
    }
    
}
