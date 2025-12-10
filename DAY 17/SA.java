public class SA extends Account
{
    int acc_Id;
    double acc_Bal;
    int min_Bal=5000;

    public SA(int id,double amount,String name,String email)
    {
        super(name, email);
        this.acc_Id=id;
        this.acc_Bal=amount;
    }

    public double cal_bal()
    {
        return (this.acc_Bal-this.min_Bal);
    }
}