class ass16
{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055}; 
        int count = 0;
        for (int i = 0; i < prices.length; i++) 
        {
            if(prices[i]%3==0)
            {
               System.out.println("divisble by 3  " + prices[i]);
                count++;
            }
             
        }
        System.err.println(count);
    }
}