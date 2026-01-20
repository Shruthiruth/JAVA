public class User2 implements UserAccess1
{
    public void login()
    {
        System.out.println("login..");
    }
     public void logout()
    {
        System.out.println("logout..");
    }

    public static void main(String[] args) {
        UserAccess1 u=new User2();
        u.login();
        u.logout();
        u.userupdate();
    }
}