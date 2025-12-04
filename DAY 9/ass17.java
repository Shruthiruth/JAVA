class ass17
{
    public static void main(String[] args) {
        int[] prices={199,129,9348,78,11,171,1055};
        int highprice = prices[0];
        for (int i = 0; i < prices.length; i++) {

            if(prices[i]>highprice)
            {
                highprice=prices[i];
                
            }
            
            
        }

        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] == highprice)
            {
                continue;   // Skip highest price
            }
            System.out.println(prices[i]);
        }
            System.out.println(highprice + "   highest");
        
         }
}
