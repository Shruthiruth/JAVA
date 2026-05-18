// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class test19 {
    public static boolean anagram(String a , String b){
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        
        Arrays.sort(arr1);
         Arrays.sort(arr2);
         
        return Arrays.equals(arr1,arr2);
        
    }
    public static void main(String[] args) {
        
        String a="listen";
        String b="silent";
        System.out.println(anagram(a,b));
        
    }
}