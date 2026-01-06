interface test2
{
    public abstract int get();
}
class test3 
{
    static test2 fi=()->100;
    public static void main (String[] args)
    {
      
        System.out.println(fi.get());
    }
}