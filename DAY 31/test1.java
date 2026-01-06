interface test1
{
    public abstract int get();
}
class test4 implements test1{
    public int get()
    {
        return 100;
    }
    public static void main (String[] args)
    {
        test1 t=new test4();
        System.out.println(t.get());
    }
}
