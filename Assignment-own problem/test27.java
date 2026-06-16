
// this program finds all pairs of numbers in an array that add up to a specific target value using a HashSet for efficient lookups.

import java.util.*;


class test27 {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15, 3, 6};
        int target = 9;

        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums) {

            int complement = target - num;

            if(seen.contains(complement)) {
                System.out.println("(" + complement + "," + num + ")");
            }

            seen.add(num);
        }
    }
}