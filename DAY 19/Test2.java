
class Test2 extends Object
{
    public static void main(String[] args) {

        Test2 t1 = new Test2();
        Test2 t2 = new Test2();
        String s1="Shruthi";
        String s2=new String("Shruthi");
        String s3=new String("aneesh");
        int a=100;
        int b=200;
        int c=300;


        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3)); //false
        System.out.println(t1.equals(t2)); //false

      //  System.out.println(a.equals(b));

      System.out.println(t1==t2);//false
      System.out.println(s1==s2);//false
      System.out.println(a==b);//false
      System.out.println(a==c);//true


    }
}