package Am.pack1;

public  class A
{
    public void m1()
    {
        System.err.println("Public class A-public method m1");
    }
    void m2()
    {
        System.err.println("Public class A-default method m2");
    }
    private void m3()
    {
         System.err.println("Public class A-private method m3");
    }
    protected void m4()
    {
        System.err.println("Public class A-protected method m4");
    }

    public static void main(String[] args) {
        A a1=new A();
        a1.m3();

    }
}