// Check if All ‘A’s Appear Before All ‘B’s

// “Given a string containing only the characters ‘A’ and ‘B’, write a Java program to check whether all ‘A’s appear before any ‘B’.
// Return true if the condition is satisfied, otherwise return false.”

class test9
{
    public static void main(String[] args) {
        String str="AABABBB";

        boolean seenB=false;

        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)=='B')
           {
                seenB=true;
           }
           else if(str.charAt(i)=='A' && seenB)
           {
                System.out.println("false");
                return;
           }
            
        }
        System.out.println("true");
    }
}