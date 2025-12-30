import java.util.*;
;
class test2 {
    public static void main(String[] args) {
        LinkedList <String> enames = new LinkedList<>(Arrays.asList("RG","SG","PG",null,null));
        System.out.println(enames);
        enames.addFirst("NM");
        enames.addLast("Amith shah");
        System.out.println(enames);
    }    
}
