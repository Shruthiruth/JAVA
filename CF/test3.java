import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

class test3
{
    public static void main(String[] args) {

        LinkedList<String> l=new LinkedList<>();

        l.add("A");
        l.add("D");
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("E");

        LinkedList<String> new_l=new LinkedList<String>();
        new_l.addAll(l);
        System.out.println(new_l);

        new_l.removeAll(l);
        System.out.println(new_l);

        Collections.shuffle(l);
        System.out.println(l);

        Collections.sort(l);
        System.out.println(l);

        Collections.sort(l, Collections.reverseOrder());
        System.out.println(l);

        LinkedList new_linkedlist=new LinkedList(Arrays.asList(l));
        System.out.println(l);

        new_linkedlist.addFirst("OF");
        System.out.println(new_linkedlist);

        new_linkedlist.addLast("OL");
        System.out.println(new_linkedlist);

        System.out.println(new_linkedlist.getLast());

        new_linkedlist.removeFirst();
        System.out.println(new_linkedlist);
    }
}