import java.util.Scanner;
class test8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    sc.close();
   // sc.nextInt(); // IllegalStateException

   try {
       sc.nextInt();
   } catch (IllegalStateException e) {
        System.out.println(e);
   }
        System.out.println("HELLO");
    }
}