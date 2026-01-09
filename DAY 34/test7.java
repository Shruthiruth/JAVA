import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


@FunctionalInterface
interface FunctionOne{
    public abstract int apply(List enames);
}
@FunctionalInterface
interface PredicateOne{
    public abstract boolean test(List enames);
}
@FunctionalInterface
interface ConsumerOne{
    public  abstract void accept(List enames);
}
public class test7 {
    public static void main(String[] args) {
    List<String> enames= Arrays.asList("RG","SG","PG","Modi");
    FunctionOne f1=names1 -> names1.size();
    Function<List,Integer> f2=names1 -> names1.size();

    PredicateOne p1=names1->names1.isEmpty();
    Predicate<List> p2=names1->names1.isEmpty();

    ConsumerOne c1=enames1 -> {
        for (Object ename:enames1) {
            System.out.println(ename);
        }
    };
    c1.accept(enames);
    Consumer<List> c2=names->{
        for (Object name:names) {
            System.out.println(name);
        }
    };
    c2.accept(enames);
    System.out.println(f1.apply(enames));
    System.out.println(f2.apply(enames));

    System.out.println(p1.test(enames));
    System.out.println(p2.test(enames));
    }
}