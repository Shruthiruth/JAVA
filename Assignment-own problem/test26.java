// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// count the frequency of each character in a string and store it in a HashMap
import java.util.*;
class test26 {
    public static void main(String[] args) {
        String s="programming";
        HashMap <Character,Integer> map= new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        
        System.out.println(map);
       
    }
}