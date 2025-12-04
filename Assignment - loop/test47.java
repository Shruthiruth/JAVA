class test47
{
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
             if(i%3==0 && i % 5==0)
            {
                System.err.println(i+"divisible by both");
            }
            else if(i%5==0)
            {
                System.err.println(i+"divisible by 5");
            }
            else if( i%3==0)
            {
                System.err.println(i+"divisble by 3");
            }
        }
    }
}