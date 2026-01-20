public class test2 implements UserAccess1
{
     public void login()
    {
        System.out.println("login2..");
    }
     public void logout()
    {
        System.out.println("logout2..");
    }

    public static void main(String[] args) {
        UserAccess1 u=new test2();
        u.login();
        u.logout();
        u.userupdate();
    }
}