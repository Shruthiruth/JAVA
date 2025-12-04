class ass3
{
    public static void main(String[] args)
    {
        int[] prices={199,129,98,78,11,171,1055};
        int count = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<100)
            {
                System.out.println(prices[i]);
                count++;
            }
           
        }
         System.out.println("count is:"+count);
    }
}