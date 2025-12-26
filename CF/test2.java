import java.util.Iterator;
import java.util.LinkedList;
class test2
{
    public static void main(String[] args) {
        LinkedList l=new LinkedList(); //--hetero
        //LinkedList<String> s=new LinkedList<>(); //--home

        l.add(100);
        l.add("hello");
        l.add(16.0);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l);
        System.out.println(l.size());

        l.remove(2);
        System.out.println("new list"+l);

        l.add(3, "java");
        System.out.println("java added"+l);

        System.out.println(l.get(3));

        l.set(3, "python");
        System.out.println(l);

        System.out.println(l.contains(null));
        System.out.println(l.isEmpty());


        // for(int i=0;i<l.size();i++)
        // {
        //     System.out.println(l.get(i));
        // }

        
        // for(Object el:l)
        //  {
        //         System.out.println(el);
        // }   

        Iterator it=l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        
 
 }
       

}