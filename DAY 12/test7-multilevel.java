class test7
{
    void s1()
    {
        System.out.println("parent");
    }
}
class test8 extends test7
{
    public void s2()
    {
        System.out.println("child");
    }
}
class test9 extends test8
{
    protected void s3()
    {
        System.err.println("grand child");
    }
}
class test10
{
    public static void main(String[] args) {
        test9 t=new test9();
        t.s1();
        t.s2();
        t.s3();
    }
}