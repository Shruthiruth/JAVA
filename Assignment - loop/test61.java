class test61
{
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int limit = 21;
        int c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        while ( c <= limit)
        {
            a=b; System.err.println ("A value:"+a);
            b=c;    System.err.println (" B value:"+b);
            c=a+b;
            System.err.println(c);
        }
        
    }
}