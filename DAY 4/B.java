package Am.pack1;
class B
{
    public void m5()
    {
        System.err.println("default class B-public method m6");
    }
    void m6()
    {
        System.err.println("default class B-default method m7");
    }
    private void m7()
    {
         System.err.println("default class B-private method m8");
    }
    protected void m8()
    {
        System.err.println("default class B-protected method m9");
    }

    public static void main(String[] args) {
        A a=new A();
        a.m1();
        a.m2();
        a.m4();

    }
}