// This is a simple implementation of the Two Sum problem using the two-pointer technique. The function `twoSum` takes an array of integers `numbers` and an integer `target`, and returns the indices of the two numbers that add up to the target. The indices are returned in a 1-based format.

import java.util.Arrays;

public class test29 {

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}