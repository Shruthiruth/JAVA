class test11
{
    int parent = 100;

}

class test12 extends test11
{
    int child1 = 200;
}

class test13 extends test11
{
    String child1 = "helo child2";
}

class test14
{
    public static void main(String[] args) {
        test13 t1=new test13();
        test12 t2=new test12();
        //test13 t3=new test11();
        System.out.println(t1.child1);
        System.out.println(t1.parent);
        System.err.println(t2.child1);
        System.out.println(t2.parent);
    }
}