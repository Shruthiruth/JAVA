import java.util.Arrays;
import java.util.List;
@FunctionalInterface

interface  test5
{
    public abstract void accept(List enames);
}
class test6
{
    public static void main(String[] args) {
        List<String> enames=Arrays.asList("AH","AN","ADF");
        test5 t=names->
        {for(Object name:names)
        {System.out.print(name+" ");}
        };
        t.accept(enames);
    }
}