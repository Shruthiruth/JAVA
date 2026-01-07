
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


@FunctionalInterface
interface test7{
    public abstract int apply(List name);
}
class test8
{
    public static void main(String[] args) {
        List<String> ename=Arrays.asList("Shru","anee","saak","anu");
        Function<List,Integer> f=name->name.size();
        test7 f1=name->name.size();
        System.out.println(f.apply(ename));
        System.out.println(f1.apply(ename));

    }
}
