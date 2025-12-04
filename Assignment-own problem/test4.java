//Given an integer array, move all zeros to the end while maintaining the order of non-zero elements.
//Do it in-place without using another array

class test4
{

    public static void main(String[] args) {
        
         int arr[] = {0, 1, 0, 3, 12};

        int j =0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }

        while(j)

            System.out.print("[");
  

        System.out.print("]");
    }

     
}