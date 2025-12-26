import java.util.HashSet;
import java.util.Iterator;

class test4
{
    public static void main(String[] args) {
        HashSet hs=new HashSet(); //default capcity 16,load factor 0.75
       // HashSet hs=new HashSet(100,(float)0.95);
        // HashSet<Integer> hs=new HashSet<>();


        hs.add(100);
        hs.add("hi");
        hs.add(19.0);
        hs.add('A');
        hs.add(null);
        hs.add(true);
        System.out.println(hs);

        hs.remove(null);
        System.out.println(hs);

        System.out.println(hs.contains('A'));
        System.out.println(hs.contains('B'));

        System.out.println(hs.isEmpty());


        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            
        }
        
      //  HashSet new_hs=new HashSet(Sets.toSet(hs));
    }
}