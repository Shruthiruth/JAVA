// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Write a Java program to compress a string using the counts of repeated characters. For example, the string "aabbcc" would become "a2b2c2".
import java.util.*;
class test20
 {
    public static void main(String[] args) {
        String arr="aabbcc";
        String result="";
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length();i++)
        {
            char ch=arr.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
                
            }
            else{
                map.put(ch,1);
            }
        }
        
       // Build compressed string
        for(char ch : map.keySet()) {

            result += ch + String.valueOf(map.get(ch));
        }
        System.out.println(result);
        
    }
}