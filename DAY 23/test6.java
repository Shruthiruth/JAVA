class test6
{
    public static void main(String[] args) {
       // int a=Integer.parseInt("abc");//NumberFormatException
       try{
        int a=Integer.parseInt("abc");
       }
       catch(NumberFormatException e)
       {
            System.out.println(e);
       }
       System.out.println("HELLO");
    }
}