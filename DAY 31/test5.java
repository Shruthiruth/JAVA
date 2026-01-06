interface test5
{
    public abstract int add(int a,int b);
}
class test6 implements test5{
    public int add(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {

        test5 t=new test6();

        System.out.println(t.add(10, 20));
    }
}