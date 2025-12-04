class test56
{// Write a program first ten multiples of 4 using a while loop 
    public static void main(String[] args) {
         int i=1;
    int count = 0;
    while(i<=100)
    {
        if(i%4==0)
        {
            System.out.println(i+ "  multiple of 4");
           
            count++;
        }
        i++;
         
        if(count == 10)
        {
            break;
        }
        }
        
    }
   
}