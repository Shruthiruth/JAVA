class test1{
    public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/1);
      //  System.out.println(10/0); //arithmetic exeception
      try {
          System.out.println(10/0);
      } catch (ArithmeticException e1) {
           System.out.println(e1);
      }
        System.out.println("GM");

    }
}