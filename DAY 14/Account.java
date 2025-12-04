public class Account {
    int acc_Id;
    String acc_Name;
    double acc_Bal;
    public Account(int id, String name, double amount){

        this.acc_Id=id;
        this.acc_Bal=amount;
        this.acc_Name=name;
    }
    public static void main(String[] args) {
        Account a1=new Account(101,"Rahul",5000.00);
        System.out.println(a1.acc_Id);
        System.out.println(a1.acc_Name);
        System.out.println(a1.acc_Bal);
    }
}