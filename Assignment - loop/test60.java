class test60
{
    public static void main(String[] args) {
        int arr[] = {1, 5, 75, 24, 56};
        int i = 0;

        while(i < arr.length)     
        {
            if(arr[i] % 2 == 0)    
            {
                System.out.println(arr[i]);
            }
            i++;                   
        }
    }
}
