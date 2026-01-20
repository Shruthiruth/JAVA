public class test1 implements UserAccess1
{
     public void login()
    {
        System.out.println("login1..");
    }
     public void logout()
    {
        System.out.println("logout1..");
    }

    public static void main(String[] args) {
        test1 u=new test1();
        u.login();
        u.logout();
        u.userupdate();
    }
}