// Scenario
// Imagine you are monitoring a continuous stream of numbers coming from a sensor or data feed. Most
// of the values are small fluctuations, but you only want to store the values that truly matter — the ones
// that are greater than or equal to everything seen before. This filtering method helps systems reduce
// noise and store only meaningful growth points. Whenever a new number arrives, you compare it with
// the current maximum value recorded so far: • If the number is greater than or equal to the max value,
// you accept it and add it to the list.
// • If the number is lower, you skip it.
// This is called a Running Maximum Filter because at any moment, the list contains only increasing (or
// equal) values based on their arrival order.
// Example 1
// Input: [1, 2, 1, 3, 3, 4, 5, 6, 1, 4, 7, 1]
// Output: [1, 2, 3, 3, 4, 5, 6, 7]

class test5 {

    public static void main(String[] args) {

        int arr[] = {2, 4, 4, 4, 1, 9, 9, 3, 12};
        int max = arr[0];
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= max) {
                max = arr[i];

                System.out.print(arr[i]);
                if (i != arr.length - 1) {
                    System.out.print(",");
                }

            } else {
                continue;
            }

        }
        System.out.print("]");

    }
}
