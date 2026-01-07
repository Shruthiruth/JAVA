@FunctionalInterface
interface test3{
    public abstract int apply(String name);
}
class test4{
    public static void main(String[] args) {
        test3 ti=(name)->(name.length());
        System.out.println(ti.apply("aneesh"));
    }
}