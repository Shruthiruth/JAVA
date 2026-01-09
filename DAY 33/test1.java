interface test1
{
    public abstract Boolean test(String ename);
}
class test2 implements test1
{
    public Boolean test(String ename)
    {
        return ename.length()>=5;
    }
    public static void main(String[] args) {
        
        test1 t1=new test2();
        System.out.println(t1.test("shruthi"));
        System.out.println(t1.test("anee"));
    }
}