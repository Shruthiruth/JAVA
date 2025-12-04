class ass14
{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055};
        for (int i = 0; i < prices.length; i++) {
            if(i>=3)
            {
                break;
            }
            System.out.println(prices[i]);
        }
    }
}