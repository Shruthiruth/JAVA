class ass4
{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055}; 
        int i = 0;
        while(i<prices.length)
        {
           if(prices[i]>500)
           {
                System.out.println(prices[i]);
                break;
           }
           i++;
        }
    }
}