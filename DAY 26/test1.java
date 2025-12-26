import java.util.*;
public class test1 {

    public static void main(String[] args) {
         // ArrayList eids = new ArrayList();   // here we will get warning "Unchecked or unsafe operation,
        //  to avoid we use generic"
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println(a); //[]
        a.add(101);
        a.add(102);
        a.add(103);
        a.add(101);
        System.out.println(a);
    }}