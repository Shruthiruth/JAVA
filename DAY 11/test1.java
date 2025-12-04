class Account
{
    private int acc_id;
    private double acc_bal;
    private String acc_name;

    public void set_AccId(int id)
    {
        this.acc_id=id;
    }
    public int get_AccId()
    {
        return this.acc_id;
    }

    public double getAcc_bal() {
        return acc_bal;
    }

    public void setAcc_bal(double acc_bal) {
        this.acc_bal = acc_bal;
    }
    public void set_AccName(String acc_name)
    {
        this.acc_name=acc_name;
    }
    public String get_AccName()
    {
        return this.acc_name;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }
}
class Demo
{
    public static void main(String[] args) {

        Account a1=new Account();
        a1.set_AccId(101);
        System.out.println(a1.get_AccId());

        a1.setAcc_bal(8970.9);
        System.out.println(a1.getAcc_bal());

        a1.set_AccName("shruthi");
        System.out.println(a1.get_AccName());
        
    }
}