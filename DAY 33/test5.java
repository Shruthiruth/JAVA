
import java.util.function.Predicate;
interface test5
{
    public abstract Boolean test(String ename);
}
class test6{
    public static void main(String[] args) {
        Predicate<String> t1=ename->ename.length()>=5;
        System.out.println(t1.test("shruthi"));
    }
}