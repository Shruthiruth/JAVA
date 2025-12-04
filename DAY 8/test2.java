 abstract class test2{

    public abstract double cal_Interest();

    public String get_name()
    {
        return "";
    }
}
class test3 extends test2
{
    public double cal_Interest()
    {
        return 0.0;
    }
    public static void main(String[] args) {
        //test2 parent = new test2();--abstract class object cannot be created
        test3 child = new test3();
        test2 parent1 = new test3();

        
        System.out.println(child.cal_Interest());
        System.err.println(child.get_name());

    }
}