import java.util.Arrays;
import java.util.List;
@FunctionalInterface

interface  test3
{
    public abstract void accept(List enames);
}
class test4 implements test3
{
    public void accept(List enames)
    {
        for(Object ename:enames)
        {
            System.out.println(ename);
        }
    }
    public static void main(String[] args) {
        List<String> enames=Arrays.asList("GH","BH","HJ");
        test3 t1=new test4();
        t1.accept(enames);
    }
}