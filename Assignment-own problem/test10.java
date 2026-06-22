// // “Given a sorted integer array and a target value, write a Java program to find the index of the target using binary search.
// // If the target is not present, return -1.”

// public class test10
// {
//     public static void main(String[] args) {
//         int arr[]={1, 3, 5, 7, 9, 11};
//         int target=9;

//         int low=0;
//         int high=arr.length-1;

//         while(low<=high)
//         {
//             int mid=(low+high)/2;

//             if(arr[mid]==target)
//             {
//                 System.out.println(mid);
//                 return;
//             }
//             else if(arr[mid]<target)
//             {
//                 low=mid+1;
//             }
//             else if(arr[mid]>target)
//             {
//                 high=mid-1;
//             }
//         }

//         System.out.println(-1);
        
        
//     }
// }


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class test10 {
    
    public static int binarysum(int[] nums,int target)
    {
        int left = 0;
        int right = nums.length-1;
        
        while(left <= right)
        {
            int mid = (left + right)/2;
            
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
                
            }
            else
            {
                right = mid - 1;
            }
            
        
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int target = 9;
        
        System.out.println(binarysum(nums,target));
        
    }
}