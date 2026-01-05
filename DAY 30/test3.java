
import java.util.Optional;

class test3
{
    public static void main(String[] args) {
       // String s="shruTThi";
       String s=null;
        Optional<String> opt=Optional.ofNullable(s);
        if(opt.isPresent())
        {
            System.out.println(opt.get().toLowerCase());
        }
        else
        {
            System.out.println("String is null");
        }

    }
}