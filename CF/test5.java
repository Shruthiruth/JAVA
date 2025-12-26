
import java.util.HashSet;

class test5
{
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();

        hs.add(2);
        hs.add(4);
        hs.add(6);

        System.out.println("evennum hs"+hs);
        HashSet<Integer> even_num=new HashSet<>();
        even_num.addAll(hs);
        even_num.add(10);
        System.out.println(even_num);

        even_num.removeAll(hs);
        System.out.println(even_num);
          HashSet<Integer> set1=new HashSet<>();  
          HashSet<Integer> set2=new HashSet<>();

          set1.add(1);
           set1.add(2);
            set1.add(3);
             set1.add(4);
              set1.add(5);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        set1.addAll(set2);       
        System.out.println("union"+set1);

        set1.retainAll(set2);
        System.out.println("intersection"+set1);

        set1.add(1);
        set1.add(2);
        set1.removeAll(set2);
        System.out.println("difference"+set1);

        System.out.println(set1.containsAll(set2));
  
    }
}