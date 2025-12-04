class test5{
    public static void main(String[] args) {
         int[] prices ={199,129,98,78,11,171,1065};
         
         for(int i=0;i<prices.length;i++)
         {
            if(prices[i]<400)
            {
                System.out.println(prices[i]);
            }
         }
    }
}