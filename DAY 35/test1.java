
import java.util.function.Supplier;

class test1
{

    public static void main(String[] args)
    {
        Supplier<Boolean> s=()->false;
        System.out.println(s.get());
    }
}