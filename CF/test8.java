
import java.util.HashMap;



class test8
{
    public static void main(String[] args) {
        //HashMap<Integer,String> hp=new HashMap<>();
        HashMap hp=new HashMap();


        hp.put(101,"shru");
           hp.put(102,"shru");
              hp.put(103,"ansh");
                hp.put(104,"viji");
           hp.put(105,"babu");
              hp.put(106,"saak");


              System.out.println(hp);

        System.out.println(hp.get(102));
        hp.remove(102);
        System.out.println(hp);

        System.out.println(hp.containsKey(108));
        System.out.println(hp.containsValue("shru"));

        System.out.println(hp.isEmpty());
        System.out.println(hp.keySet()); // return key as a 1 set
        System.out.println(hp.values()); // return all value as a collection

        System.out.println(hp.entrySet()); //return all entry as a set
        

    }
}