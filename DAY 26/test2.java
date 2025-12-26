

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        // iterate arraylist object & print all the emp name?
        // using for loop
                System.err.println("----------------------Using for loop-----------------------");

        for(int i=0; i<enames.size(); i++){
            System.out.println(enames.get(i));
        }
        System.err.println("----------------------using while loop-------------------------");
        // using while loop
        int i =0;
        while (i<=enames.size()-1) {
            System.out.println(enames.get(i)); 
            i++;           
        }
                System.err.println("----------------using foreach-------------------------------");

        // using foreach

        for(String ename : enames){
            System.out.println(ename);
        }
        
    }
}
