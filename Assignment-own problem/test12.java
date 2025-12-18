//Given a square matrix, calculate the absolute difference between the sum of its primary diagonal and the sum of its secondary diagonal.” Definitions: Primary diagonal: elements where row index = column index Secondary diagonal: elements where row index + column index = n - 1 Example: Input: matrix = [ [1, 2, 3], [4, 5, 6], [7, 8, 9] ] Output: 0

public class test12
{
    public static void main(String[] args)
    {
        int arr[][]={
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        int primary_sum = 0;
        int secondary_sum = 0;
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
           primary_sum=primary_sum+arr[i][i];
           secondary_sum=secondary_sum+arr[i][n-1-i];
        }

        int result=Math.abs(primary_sum-secondary_sum);
        System.out.println(result);
    }
}