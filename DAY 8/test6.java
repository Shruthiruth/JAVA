abstract class test6{

    public int m1()

    {
        return 0;
    }

    public void wish()
    {

    }
}
class test7 extends test6
{
    public int m1()
    {
        return 1;
    }
    public static void main(String[] args) {
        //test6 parent = new test6();
        test7 child = new test7();
        test6 parent1 = new test7();

        
        System.out.println(parent1.m1());
        child.wish();
       // System.err.println(child.wish());--error because of no implementation
        

    }
}