class test40
{
    public static void main(String[] args) {
        int x = 13400;
        int y = 20450;
        int z = 4876;

        if(x< y && x<z)
        {
            System.err.println("x is lesser than y and z");
        }
        else if(y<x && y<z)
        {
            System.err.println("y is lesser than z and x");
        }
        else if(z<x && z<y)
        {
            System.err.println("z is lesser than x and y");
        }
        else
        {
            System.err.println("x,y,z are equal");
        }

    }
}