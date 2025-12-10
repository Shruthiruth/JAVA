class Test
{
    public static void main(String[] args) {
             SA s=new SA(101,23000.00,"rahul","rahul@gmail.com");

            //  System.out.println(s.cal_bal());

            System.out.println(AccountService.getService(s));

             CA c=new CA(102,25000.00,"shruthi","shruthi@gmail.com");
             c.setMin_Bal(10000);
            //  System.out.println(c.cal_bal());

            System.out.println(AccountService.getService(c));
    }
}