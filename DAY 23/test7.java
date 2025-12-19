class test7
{
    public static void main(String[] args) {
        String s="java";
        //System.out.println(s.charAt(10)); // StringIndexOutOfBoundsException

        try {
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("HELLO");
    }
}