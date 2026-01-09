interface test3
{
    public abstract Boolean test(String ename);
}
class test4
{
    public static void main(String[] args) {
        test3 t1=ename->ename.length()>=5;
        System.out.println(t1.test("saakshi"));
        System.out.println(t1.test("anu"));
    }
}