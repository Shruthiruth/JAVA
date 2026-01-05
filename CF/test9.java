
import java.util.Hashtable;
import java.util.Map;


class test9
{
    public static void main(String[] args)
    {
        Hashtable<Integer,String> t=new Hashtable<>();
        t.put(1, "john");
        t.put(2, "shruthi");
        System.out.println(t);
        try {
              t.put(null, "x");
        } catch (NullPointerException e) {
             System.out.println("exception");
        }
        t.put(3, "saakshi");

        System.out.println(t);
        t.remove(1);
        System.out.println(t);
        System.out.println(t.containsKey(2));
        System.out.println(t.containsValue("aneesh"));
        System.out.println(t.isEmpty());
        System.out.println(t.keySet());
        System.out.println(t.values());

        for(int k:t.keySet())
        {
            System.out.println(k+"   "+t.get(k));
        }
        //Entryspecific method

        for (Map.Entry  entry: t.entrySet()) {
            
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        // // iterator method
        // Set s=t.entrySet();
        // Iterator itr=s.iterator();

        // while (itr.hasNext()) {
        //     Map.Entry entry =(Entry) itr.next();
        //     System.out.println(entry.getKey()+"  "+entry.getValue());

            
        // }
    }
}