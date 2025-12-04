class test62{

    public static void main(String args[]){
        int n = 153;
        int originalnumber=153;
        int lastdigit=0;
        int sum =0;
        
        while(n>0)
        {
            lastdigit = n%10;
            System.out.println("last digit :"+lastdigit);
            int CUBENumber=lastdigit*lastdigit*lastdigit;
            System.out.println("cube of last digit :"+CUBENumber);
            sum = sum + CUBENumber;
            System.out.println("sum value :"+sum);
            
            n=n/10;
            
        }

        if(originalnumber==sum)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}