// // Merge Strings Alternately

// “Given two strings word1 and word2, merge them by alternating characters starting with word1.
// If one string is longer than the other, append the remaining characters at the end.”

class test7
{
    public static void main(String[] args) {
        String word1 ="abc";
        String word2 ="pqr";

   
        int max=Math.max(word1.length(), word2.length());
       for(int i=0;i<max;i++)
       {
           
            if(i<word1.length())
            {
                System.out.print(word1.charAt(i));
                
            }
            if(i<word2.length())
            {
                System.out.print(word2.charAt(i));
                
            }
       }

    }
}