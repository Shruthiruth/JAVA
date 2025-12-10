
class CA extends Account {

    int acc_Id;
    double acc_Bal;
    private int min_Bal;

    public CA(int id, double amount, String name, String email) {
        super(name, email);
        this.acc_Bal = amount;
        this.acc_Id = id;

    }

    public double cal_bal() {
        return (this.acc_Bal - this.getMin_Bal());
    }

    public int getMin_Bal() {
        return min_Bal;
    }

    public void setMin_Bal(int min_Bal) {
        this.min_Bal = min_Bal;
    }

}
