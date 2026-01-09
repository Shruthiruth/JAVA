
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
interface test7
{
    public abstract Boolean test(List ename);
}
class test8{
    public static void main(String[] args) {
        Predicate<List> l=names->names.isEmpty();
        System.out.println(l.test(Arrays.asList("GH","f","")));
    }
}