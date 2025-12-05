public class Test{

    public static void main (String[] args)
    {
        Saving_Account t = new Saving_Account(101,"rahul","shruthi@gamil.com",114000);
        t.setMin_Bal(60000);
        t.cal_bal();
        Current_Account t2 = new Current_Account(103,"aneesh","aneesh#gmail.com",180000);
        t2.setMin_Bal(70000);
        t2.cal_bal();
        
    }
}