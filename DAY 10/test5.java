interface test5
{
    double min_bal=100.0; //public and final
}
class test6 implements test5{
    public static void main(String[] args) {
        test6 child=new test6();
        System.out.println(min_bal);
        System.out.println(child.min_bal);
    }
}