
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class test2
{
    public static void main(String[] args) {
        try {
            PrintWriter p=new PrintWriter("abc1.txt"); 
        } catch (FileNotFoundException e) { 
        }
    }
}