//bubble sort

// public class test11
// {
//     public static void main(String[] args) {
//         int arr[]={5, 1, 4, 2, 8};
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr.length-1;j++)
//             {    

//                 if(arr[j]>arr[j+1])
//                 {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;                    
//                 }
//             }
//         }
//         System.out.print("[");
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//             if(i!=arr.length-1)
//             {
//                 System.out.print(",");
//             }
//         }
//         System.out.print("]");
//     }
// }




// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int arr[]={5, 3, 8, 4, 2};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {   
                     int temp=arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}