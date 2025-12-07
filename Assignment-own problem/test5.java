//You are given an array of digits that represents a non-negative integer.
//Increment the integer by one and return the resulting array of digits.

class test5
{
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,8,9};
        for(int i = arr.length - 1; i >= 0; i--)
        {
            if(arr[i]<9)
            {
                arr[i]=arr[i]+1;
                printArray(arr);
                return;
            }

            arr[i]=0;
            }
            
            int newarr[]=new int[arr.length+1];

             newarr[0]=1;
                printArray(newarr);
    }
     static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0;  i < a.length; i++) {
            System.out.print(a[i]);
            if(i!=a.length-1)
            {
                System.out.print(",");
            }
        }
     
        System.out.print("]");
        
    }
}


