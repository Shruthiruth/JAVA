// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Given an array of integers, find all the duplicate elements in the array and return them as a list.
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,2,4,5,1,6};
    
        
        HashMap <Integer,Integer> map = new HashMap();
            ArrayList<Integer> dup = new ArrayList<>();
        
        for(int i=0;i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        
        for(int i=0;i<arr.length; i++)
        {
            if(map.get(arr[i])>1 && !dup.contains(arr[i]))
            {
                 dup.add(arr[i]);
            }
        }
         System.out.println(dup);
        
        
        
        
        
    }
}