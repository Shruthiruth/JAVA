public  class Current_Account extends Account{

    int acc_Id;
    double acc_Bal;
    double min_Bal=10000;
    public Current_Account(int id,String name,String email , double amount)
    {
        super(name, email);
        this.acc_Id=id;
        this.acc_Bal=amount;
    }

    public void cal_bal()
    {
        System.out.println(this.acc_Bal-this.min_Bal);

    }
}