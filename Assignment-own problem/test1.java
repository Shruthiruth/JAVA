//Find the second largest distinct number in this array (without sorting):

class test1{

    public static void main(String[] args) {
        int arr[]={5, 1, 9, 7, 3};

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
                {
                secondlargest=largest;
                System.err.println(secondlargest+"  second");
                largest=arr[i];
                System.err.println("largect "+largest);
                }
            else if(arr[i]>secondlargest && arr[i]!=largest)
                {
                    secondlargest=arr[i];
                    System.err.println("secondlargest  "+secondlargest);
                }
            

        }

        System.out.println(secondlargest);

    }
}