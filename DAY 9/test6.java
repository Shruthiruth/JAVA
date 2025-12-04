class test6{
    public static void main(String[] args) {
          int[] prices ={199,129,98,78,11,171,1065};

          int prod_price[] = new int[prices.length];
          for( int i=0;i<prices.length;i++)
          {
            prod_price[i]=prices[i];
          }

          for(int price : prod_price)
          {
            System.out.println(price);
          }
    }
}