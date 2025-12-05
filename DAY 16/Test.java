public class Test{

    public static void main (String[] args)
    {
        Saving_Account t = new Saving_Account(101,"rahul","shruthi@gamil.com",14000);
        t.cal_bal();
        Current_Account t2 = new Current_Account(103,"aneesh","aneesh#gmail.com",45000);
        t2.cal_bal();
    }
}