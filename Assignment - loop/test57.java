class test57
{
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while(i<=100)
        {
            if(i%6==0)
            {
                System.out.println(i + " is a multiple of 6");
                count++;
            }
            i++;
            if(count == 10)
            {
                break;
            }
        }
    }
}