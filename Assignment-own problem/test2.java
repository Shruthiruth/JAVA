//Reverse the given string without using StringBuilder.reverse(), StringBuffer.reverse(), Collections, or any built-in reverse method.

class test2
{
    public static void main(String[] args) {
        
        String word = "Hello World";

        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--)
        {
            reverse = reverse + word.charAt(i);
        }

        System.out.println("reverse string is " + reverse);
    }
}

