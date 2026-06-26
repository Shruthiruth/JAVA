// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Assignment-own problem : Prime number check
class test30 {
    public static void main(String[] args) {
      
      int num = 4;
      
      if(num<=1)
      {
          System.out.println("not prime");
          return ;
      }
      for(int i=2;i<num;i++)
      {
          if(num % i == 0)
          {
               System.out.println("not prime");
                return ;
          }
      }
      System.out.println(" prime");
      return ;
    }
}