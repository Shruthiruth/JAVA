class BankAccount
{
    private int accountNumber;
    private String name;
    private double balance;

    public BankAccount(int accountNumber,String name,int balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
    }

    public void depoist(double amount)
    {
        if(amount>0)
        {
                balance=balance+amount;
                System.out.println("depoist amount"+amount);
        }
       
    }

    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance=balance-amount;
            System.out.println("withdraw"+amount);
        }
        else
        {
            System.out.println("insuffient balance");
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public static void main(String[] args) {
        
        BankAccount a=new BankAccount(101,"shruthi",4000);
        
        a.depoist(5000);
        System.out.println("current bal"+a.getBalance());
        
        a.withdraw(3000);
        System.out.println("current bal"+a.getBalance());
    }


}