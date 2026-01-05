
@FunctionalInterface
// any interface that contain only one abstract method then that is functional interface
// to restrict, by using @FunctionalInterface -> if we use then we can't add one more abstract method
// what is the use of FI ? --> to use  lambda expression
interface DaoI{
    public abstract void login();
    // public abstract void logout();
}
class DaoImpl implements DaoI{
    public void login(){
        System.out.println("login success");
    }

}
class Test{
    public static void main(String[] args) {
       DaoI obj = new DaoImpl();
       obj.login();
    }
}