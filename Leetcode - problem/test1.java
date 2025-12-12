//find the number of good pairs--two student with same ID are called good pairs
/*Find the Number of Good Pairs 
Scenario: 
Imagine you have a list of student IDs. 
A good pair is when two students have the same ID and the first student appears before the second. 
Formally, a pair (i, j) is good if: 
• nums[i] == nums[j] 
• i < j 
You need to count how many such good pairs exist. */
class test1
{

    public static void main(String[] args) {
    int arr[]={1,2,3,1,1,3};
    //int arr[]={1,1,1};
    int count = 0;

    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
            }
        }
    } 
    
    System.out.println(count);
    }
}