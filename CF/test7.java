
import java.util.Iterator;
import java.util.LinkedList;
// no hetero geneous data in priority queue and in linked list is hetero allowed
class test7
{
    public static void main(String[] args) {
        
        //PriorityQueue<String> q=new PriorityQueue<>();

        LinkedList q=new LinkedList();
        q.add("A");
        q.add("B");
        q.add("C");
        q.offer(100 );

        System.out.println(q);

       // System.out.println(q.element());//return head element --if queue is empty return .NoSuchElementException

        System.out.println(q.peek());

        //remove element and return queue
        //System.out.println(q.remove());
        System.out.println(q); //[b,c,c]
        System.out.println(q.poll());
        System.out.println(q);


            Iterator it=q.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }


            for(Object s:q)
            {
                System.out.println(s);
            }
    }
}