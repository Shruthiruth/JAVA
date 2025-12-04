interface ass8
{
    public static void main(String[] args)
    {
        int[] prices={199,129,98,78,11,171,1055}; 
        int priceamount=0;
        for (int i=0; i< prices.length; i++) {
          
          priceamount=priceamount+prices[i];
        }
       System.out.println(priceamount);
    }
}