interface  test1
{
    public abstract void login();
    public abstract void logout();

}
class  test2 implements test1{
        public void login()
        {
            System.out.println("login success");
        }
        public void logout()
        {
            System.out.println("logout success");
        }
        public static void main(String[] args) {
            test1 parentchild = new test2();
            parentchild.login();
            parentchild.logout();

        }
}