import java.util.*;
//non repeating character in a string
class Main {
    public static void main(String[] args) {

        String s = "aabbcdeff";

        HashMap<Character, Integer> count = new HashMap<>();

        // Step 1: Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }
        }

        // Step 2: Find first non-repeating
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (count.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}