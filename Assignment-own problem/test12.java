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
           primary_sum+=arr[i][i];
           secondary_sum+=arr[i][n-1-i];
        }

        int result=Math.abs(primary_sum-secondary_sum);
        System.out.println(result);
    }
}

// public class DiagonalDifference {

//     public static int diagonalDifference(int[][] matrix) {

//         int primary = 0;
//         int secondary = 0;

//         int n = matrix.length;

//         for (int i = 0; i < n; i++) {

//             primary += matrix[i][i];

//             secondary += matrix[i][n - 1 - i];

//         }

//         return Math.abs(primary - secondary);
//     }

//     public static void main(String[] args) {

//         int[][] matrix = {
//                 {1,2,3},
//                 {4,5,6},
//                 {9,8,9}
//         };

//         System.out.println(diagonalDifference(matrix));

//     }
// }