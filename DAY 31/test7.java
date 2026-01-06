@FunctionalInterface
interface test7
{
    public abstract int add(int a,int b);
}
class test8
{
    public static void main(String[] args) {
        test7 ci=(a,b)->(a+b);
        System.out.println(ci.add(10, 20));
    }
}