// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//find missing number in an array of 1 to n
class test23 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int actualsum=0;
        int total=0;
        int maxi=arr[0];
        int mini=arr[0];
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > maxi) {

                maxi = arr[i];
            }

            if(arr[i] < mini) {

                mini = arr[i];
            }
        }

        for(int i=mini;i<=maxi;i++)
        {
            total += i;
        }
        for(int i=0;i<arr.length;i++)
        {
            actualsum += arr[i];
        }
        
        int result=total - actualsum;
        System.out.println(result);
    }
}