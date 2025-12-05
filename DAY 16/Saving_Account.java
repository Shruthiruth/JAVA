public class Saving_Account extends Account
{
    int acc_ID;
    double acc_Bal;
    double min_Bal=5000.00;

    public Saving_Account(int id,String name, String email,double amount)
    {
        super(name,email);
        this.acc_ID=id;
        this.acc_Bal=amount;
    }

    public void cal_bal()
    {
        System.out.println(this.acc_Bal-this.min_Bal);
    }

}