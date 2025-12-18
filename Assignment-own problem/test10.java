// “Given a sorted integer array and a target value, write a Java program to find the index of the target using binary search.
// If the target is not present, return -1.”

public class test10
{
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 7, 9, 11};
        int target=9;

        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==target)
            {
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
        }

        System.out.println(-1);
        
        
    }
}