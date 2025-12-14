//“Write a Java program to split a given string into chunks of size n.
//If the last chunk has fewer characters, include it as it is.
//Do not use built-in substring split methods.


class test6 {
    public static void main(String[] args) {
        String s = "abcdefghij";
        int n = 3;
        String chunk = "";

        for (int i = 0; i < s.length(); i++) {
            chunk = chunk + s.charAt(i);  // append character to chunk

            if ((i + 1) % n == 0) {
                System.out.println(chunk); // print chunk in new line
                chunk = "";               // reset chunk
            }
        }

        // print last chunk if it exists
        if (!chunk.equals("")) {
           System.out.println(chunk);
        }
    }
}
