import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
interface test1{
    public abstract void accept(List ename);
}
class test2{
    public static void main(String[] args) {
        List<String> ename=Arrays.asList("GH","SJ","SD");
        Consumer<List> c=name->{
            for(Object enam:name)
            {
                System.out.println(enam);
            }
        };
        c.accept(ename);
    }
}