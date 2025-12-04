class ass6
{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055};
        int max=prices[0];

        for(int i=0;i<prices.length;i++)
        {
           
            if(prices[i]>max)
            {
               max=prices[i];
            }

          
        }
          System.out.println(max);
    }
}