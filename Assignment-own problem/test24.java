// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// find the elements in arr1 which are not present in arr2 and print them in an arraylist
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr1={10,20,30};
        int[] arr2={10};
        
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=0;i<arr1.length;i++)
        {
            boolean found=false;
            
            for(int j=0;j<arr2.length;j++)
            {
            if(arr1[i]==arr2[j])
            {
               found=true;
               break;
            }
            }
            if(!found)
            {
                res.add(arr1[i]);
            }
        }
        
        System.out.println(res);
    }
}