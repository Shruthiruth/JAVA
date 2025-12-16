public class test3
{
    public static void main(String[] args) {
        int a=100;
        //Integer b=a;//autoboxing
        Integer b=Integer.valueOf(a);
        //int c=b; //unboxing
        int c=b.intValue();

        System.out.println(a);
         System.out.println(b);
          System.out.println(c);
      //  System.out.println(c.equals(b));

    }
}