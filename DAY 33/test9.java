import java.util.Arrays;
import java.util.List;
interface test9
{
    public abstract Boolean test(List ename);
}
class test10 implements test9{
    public Boolean test(List ename)
    {
        return ename.isEmpty();
    }
    public static void main(String[] args) {
        List<String> ename=Arrays.asList("GH","f","");
        test9 t1=new test10();
        System.out.println(t1.test(ename));
    }
}