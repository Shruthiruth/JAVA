
import java.util.function.Function;

@FunctionalInterface
interface test5{
    public abstract int apply(String name);
}
class test6
{
    public static void main(String[] args) {
        Function<String,Integer> ti=name->name.length();
        System.out.println(ti.apply("shruthi"));
    }
}