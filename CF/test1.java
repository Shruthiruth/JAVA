
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class test1{
    public static void main(String[] args) {
        //ArrayList<Integer> al=new ArrayList<>();
       // List al=new ArrayList<>();
        ArrayList al =new ArrayList();
        al.add(1000);
        al.add("welcome");
        al.add(200);
        System.out.println(al);
       // al.remove(1);
        al.remove("welcome");
        System.out.println(al);
        al.add(2, "python");
        al.add(2000);
        al.add("saakshi");
        System.out.println(al);
        System.out.println(al.get(2));
        System.out.println(al.set(2, "al"));
        System.out.println(al.contains("al"));
        System.out.println(al.isEmpty());
        System.out.println(al);


        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i));
        }

        for(Object Al:al)
        {
            System.out.print(Al);
        }

        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


        ArrayList al_dup = new ArrayList();
        al_dup.addAll(al);
        System.out.print(al_dup);
        al_dup.removeAll(al);
        System.out.println(al_dup);
       // Collections.sort(al);
       //Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);



        //conversion from array to arraylist

        String arr[]={"dog","animal","elephant"};
        for(String value:arr)
        {
            System.out.println(value);
        }

        ArrayList val=new ArrayList(Arrays.asList(arr));
        System.out.println(val);
        

    }
}