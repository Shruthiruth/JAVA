import java.sql.Array;
import java.util.Arrays;
class test42{

    public static void main(String[] args) {
        int num[]={235,525,357};

        Arrays.sort(num);

        for(int i=num.length-1;i>=0;i--)
        {
            System.err.println(num[i]+ " ");
        }
    }
}