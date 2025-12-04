class test59
{
    public static void main(String[] args) {
        int number = 34536;

        int reverse = 0;
        
        while(number>0)
        {
            int lastdigit = number % 10;
            reverse = reverse*10+lastdigit;
            number = number / 10;
        }
         System.out.println(reverse);
       
    }
}