interface test2{
    public abstract boolean get();
}
class test3 {

    public static void main(String[] args) {
        test2 t=()->false;
        System.out.println(t.get());
    }
}