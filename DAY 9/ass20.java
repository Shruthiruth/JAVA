class ass20
{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055};
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
            if(sum>=500)
            {
                break;
               
            }
          
        }
        System.out.println(sum);
    }
}