// ++x/x++ calculation

class test13
{
    public static void main(String[] args)
    {
        int x = 5;
        System.out.println(++x / x++); //1

        
        int y = ++x + x++;
        System.out.println(y);

        int z = 10;
        z = z++ + ++z;
        System.out.println(z);



    }
}