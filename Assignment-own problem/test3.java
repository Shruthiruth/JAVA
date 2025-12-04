//Reverse the given integer array in-place using the two-pointer technique.
//You should NOT use extra arrays or Collections.reverse()

class test3
{
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
       // int reverse=0;
       System.err.print("[");
        for(int i=arr.length-1;i>=0;i--)

        {
            
            System.out.print(arr[i]);
            if(i!=0)
            {
                System.out.print(",");
            }
        }
        System.out.println("]");


       // ---------------------------------------------- //
        
       int start =0;
       int end = arr.length - 1;

       while(start<end)
       {

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        start++;
        end--;
       }

       System.out.print("[");
       for (int  i=0; i < arr.length; i++) {

        System.out.print(arr[i]);
        if(i!=arr.length-1)
        {
            System.out.print(",");
        }

           
       }
       System.out.print("]");


    }
}
