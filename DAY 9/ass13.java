class ass13
{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055};
        for (int i = 0; i < prices.length; i++) 
        {
            if(prices[i]<50)
            {
                System.out.println("less price value " + prices[i]);
                break;
            }
            System.out.println(prices[i]);
        }
    }
}