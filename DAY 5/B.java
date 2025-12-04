package Am.pack1;
class B extends A{
    public void m5()
    {
        System.err.println("Default class B-public method m5()");
    }

    public static void main(String[] args) {
        A a=new A();
        a.m1();
        a.m2();
       // a.m3();
        a.m4();

        B b=new B();
        b.m5();
        b.m1();
        b.m2();
        //b.m3();
        b.m4();
    }
}