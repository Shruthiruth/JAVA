class test1
{

}
class test2 extends test1
{

}
class test3
{
    public static void main(String[] args) {
        test1 t1=new test1();
        test2 t2=new test2();
        test2 t3=new test2();
        String s1=new String("shruthi");
        String s2="shruthi";
        String s3=new String("aneesh");
        String s4="ineya";
        int a=100;
        int b=100;

        System.out.println(t1.equals(s1));
        System.out.println(t1==t2);//false
    }
}