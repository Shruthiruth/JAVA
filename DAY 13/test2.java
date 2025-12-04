public class test2{

    public String m1()
    {
        return "pc-m1";
       // System.out.println("p-c:m1()");
    }
}

class test3 extends  test2
{
    public void m2()
    {
        System.out.println("cc-m2");
    }
    public void m3()
    {
        System.out.println("cc-m3");
    }
}
class test4
{
    public static void main(String[] args) {
        test2 parent = new test2();
       System.out.println(parent.m1());
        test3 child = new  test3();
        System.out.println(child.m1());
        child.m2();
        child.m3();
        test2 parchild= new test3();
        System.out.println(parchild.m1());
    }
}