/*Richest Customer Wealth
Scenario
You’re helping a bank analyze customer wealth.
Each customer has money stored across mul􀆟ple accounts: saving, current, salary, etc.
You’re given a 2D list:
 Each row represents one customer
 Each column is an account balance
Your job is simple:
Find the customer who has the highest total money across all their accounts.
Return the maximum wealth.*/
class test3
{
    public static void main(String[] args) {

        int account[][]={
            {1, 5},
            {7, 3},
            {3, 5}
    };
        
        int maxwealth=0;
        for(int i=0;i<account.length;i++)
        {
            int sum=0;
            
            for (int j=0;j<account[i].length;j++) {

                
                sum=sum + account[i][j];
                
                //System.out.println(account[i][j]);
                if(sum>maxwealth)
                {
                    maxwealth=sum;
                }
            }
        }
            System.out.println(maxwealth);
    }
}