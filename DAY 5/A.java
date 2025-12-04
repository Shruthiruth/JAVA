package Am.pack1;
public class A{

    public void m1()
    {
        System.err.println("public class A-public method m1()");
    }

    void m2()
    {
        System.err.println("public class A-default method m2()");
    }

    private void m3()
    {
        System.err.println("public class A-Private method m3()");
    }

    protected void m4()
    {
        System.err.println("public class A-protected method m4()");
    }
    public static void main(String[] args) {

        B b=new B();
        b.m5();
        
    }
}
