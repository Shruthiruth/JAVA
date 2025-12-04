//Write a program to print the greatest number in given three numbers? 

class test39
{
    public static void main(String[] args) {
        int a = 1071;
        int b = 456;
        int c = 7893;

        if(a>b && a>c)
        {
            System.err.println("a is greater than b and c");
        }
        else if( b > a && b > c)
        {
            System.err.println("b is greater than a and c");
        }
        else if(c > a && c > b)
        {
            System.err.println("c is greater than a and b");
        }
    }
}