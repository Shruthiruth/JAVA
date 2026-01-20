public interface UserAccess1
{

    public default void userupdate(){
        System.out.println("updating user profile");
    }
    public abstract void login();
    public abstract void logout();

}