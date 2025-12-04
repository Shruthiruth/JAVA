class ass12
{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055};
        int userprice=171;
    for (int i = 0; i < prices.length; i++) {

        if(prices[i]==userprice)
        {
            break;
        }
        System.out.println(prices[i]);
    }
        
    }
}