public class Saving_Account extends Account
{
    int acc_ID;
    double acc_Bal;
    private double min_Bal;

    public Saving_Account(int id,String name, String email,double amount)
    {
        super(name,email);
        this.acc_ID=id;
        this.acc_Bal=amount;
    }

    public void cal_bal()
    {
        System.out.println(this.acc_Bal-this.getMin_Bal());
    }

    public double getMin_Bal() {
        return min_Bal;
    }

    public void setMin_Bal(double min_Bal) {
        this.min_Bal = min_Bal;
    }

}