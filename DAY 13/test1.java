class grandparent
{
    void m1()
    {
        System.out.println("grandparent");
    }

    String abc()
    {
        return "good luck";
    }
}
class parent extends grandparent
{

    void m1()
    {
       System.out.println("override grandparent");
    }

    void m2()
    {
        System.out.println("parent");
    }
}
class child extends parent
{
    void m3()
    {
        System.out.println("child");
    }
    public static void main(String[] args) {

        grandparent gp=new grandparent();
        gp.m1();
        System.out.println(gp.abc());
        child c1=new child();
        c1.m1();
        c1.m2();
        c1.m3();
        System.out.println(c1.abc());
        parent p1= new child();
        p1.m1();
        p1.m2();
        System.out.println(p1.abc());
    }
}