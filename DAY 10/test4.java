interface Bank
{
    double calc_bank();
}
class Account implements Bank
{
   public double calc_bank()
   {
        return 0.0;
   }
}
class test4
{
    public static void main(String[] args) {
        Account child=new Account();
        System.err.println(child.calc_bank());
    }
}