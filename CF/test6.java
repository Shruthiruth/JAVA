
import java.util.HashSet;
import java.util.LinkedHashSet;

class test6
{
    public static void main(String[] args) {
        HashSet set1=new HashSet();
        LinkedHashSet set2=new LinkedHashSet();
        set1.add(100);
         set1.add(200);
          set1.add(300);
           set1.add(400);
           System.out.println(set1);
        set2.add(100);
         set2.add(200);
          set2.add(300);
           set2.add(400);
            System.out.println(set2);
    }
}