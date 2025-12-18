// “Longest Subarray with Equal 0s and 1s” 
// Scenario :  
// A tech company is analyzing user ac vity logs from its mobile app. 
// Every second, the app records: 
//  1 → user was active 
//  0 → user was inacrive 
// These logs are stored as a binary array. 
// The analy cs team wants to find a con nuous me window where the app usage was balanced. 
// Balanced means: 
// The number of ac ve seconds (1) is equal to the number of inac ve seconds (0). 
// Your task is to find the length of the longest con nuous subarray where this balance exists. 
// This helps the company understand stable usage pa erns instead of spikes or drops. 
// You are given a binary array nums containing only 0s and 1s. 
// Return the maximum length of a con guous subarray that contains an equal number of 0s and 1s. 
// If no such subarray exists, return 0.
class test7
{
    public static void main(String[] args) {
        int arr[]={0,1,1,1,0};
        int count_1=0;
        int count_0=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0 )
            {
                count_0++;
            }else{
                count_1++;
            }
        }
        int final_ = 0;
        if (count_0 < count_1)
        {
            final_ = count_0 ;
            }
            else
            {
                 final_ = count_1 ;
            }
System.out.println(final_*2);
    }
}
