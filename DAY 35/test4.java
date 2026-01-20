interface test4{
    public abstract boolean get();
}
class test5 implements test4{
    public boolean get()
    {
        return true;
    }
    public static void main(String[] args) {
        test4 t=new test5();
        System.out.println(t.get());
        
    }
}