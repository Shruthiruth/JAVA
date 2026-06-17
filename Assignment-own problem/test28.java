// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Two Sum Problem


import java.util.*;
class test28 {
    public static int[] twosum(int[] nums,int target){
        

        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement),i};
            }
            
            map.put(nums[i],i);
        }
        
        return new int[]{};
    }
    public static void main(String[] args) {
        
        int[] nums={2,7,11,15};
        int target=9;
        
        System.out.println(Arrays.toString(twosum(nums,target)));
       
    }
}