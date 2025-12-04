class test2{

     public void m1() //final method cannot be overridden
    {
        System.out.println("parent class - m1 method ");
    }
     public void m2()
    {
        System.out.println("parent class - m2 method ");
    }
}

class test3 extends test2
{

    public void m1()
    {
        System.err.println("child class - m1 method overridden ");
    }
    public void m3()
    {
        System.out.println("child class - m3 method");
    }
        public static void main(String[] args) {
        test2 parent = new test2();
        parent.m1();
        parent.m2();

        test3 child = new test3();
        child.m1(); //overridden from parent
        child.m2(); //parent
        child.m3(); //child

        test2 parent2 = new test3();
        parent2.m1(); //overridden 
        parent2.m2();
    }
 }