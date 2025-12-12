//Kids With the Greatest Number of Candies 

/*Scenario: 
A school is celebrating “Sweet Day.” 
Every kid gets some candies, but not all of them get the same number. 
The teacher wants to know which kids could have the most candies, if she gives each of them the 
same number of extra candies. 
You’re given: 
• A list where each value represents how many candies a kid currently has. 
• A number extraCandies — candies the teacher can give to each kid (individually). 
For each kid, you check: 
“If this kid gets the extra candies, will they have the highest number of candies among all kids?” 
If yes → mark as True 
If not → mark as False 
You return a list of True/False values for all kids.  */

class test2
{
    public static void main(String[] args) {
        int candies[]={2,3,5,1,3};
        //int candies[]={4, 2, 1, 1, 2};
        int extraCandies=3;
        int max =Integer.MIN_VALUE;

        for(int i=0;i<candies.length;i++)
        {
                if(candies[i]>max)
                {
                    max=candies[i];
                    System.out.println(max);
                }

        }

        for(int i=0;i<candies.length;i++)
        {
            int updatedcandies=extraCandies+candies[i];
            if(updatedcandies>=max)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }




    }
}