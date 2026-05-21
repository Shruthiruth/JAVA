// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Given an array of integers, find the first duplicate element in the array. If there are no duplicates, return -1.
import java.util.*;
class test21 {
    public static void main(String[] args) {
        int[] arr={2,5,1,2,3,5,1};
        HashMap <Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> dup = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                
            }
            else{
                map.put(arr[i],1);
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])>1 && !dup.contains(arr[i]))
            {
                dup.add(arr[i]);
            }
        }
        
        System.out.println(dup.get(0));
        
}
}