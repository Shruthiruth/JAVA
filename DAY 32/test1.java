

@FunctionalInterface
interface test1{
    public abstract int apply(String name);
}
class test2 implements test1
{
    public int apply(String name)
    {
        return name.length();
    }
    public static void main(String[] args) {
        test1 ti=new test2();
        System.out.println(ti.apply("shruthi"));
    }
}