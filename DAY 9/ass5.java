class ass5
{
    public static void main(String[] args) {
        int prices[]={199,129,98,78,11,34,23,171,1055};

        
        for(int i=0;i<prices.length;i++)
        {
        if(prices[i]<50)
        {
            
            continue;
           
        }
            System.out.println(prices[i]);
        }
    }
}