class test48
{
    public static void main(String[] args) {
        int number = 45;
        int largestprime = 1;

            for(int i=1; i<=number;i++)
            {
                if(number % i==0)

                {
                    System.out.println(i+"--divided number");
                    boolean isPrime = true;
                    if(i<=1)
                    {
                        isPrime=false;
                        System.out.println(i);
                    }
                    else
                    {
                        for(int j=2;j<i;j++)
                        {
                            if(i%j==0)
                            {
                                System.out.println(i+"not");
                                isPrime = false;
                                break;
                               
                            }
                        }
                    }

                if(isPrime)
                {
                    largestprime = i;
                }
                }

            } 
        System.out.println("Largest Prime Factor: " + largestprime);
              
    }
  

}