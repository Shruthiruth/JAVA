class ass11
{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055};
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<200)
            {
                System.out.println("low price   "+prices[i]);
            }
            else
            {
                System.out.println("high price   "+prices[i]);
            }
        }
    }
}