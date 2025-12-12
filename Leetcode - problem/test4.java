/*Shuffle the Array
Scenario
A gaming company stores player data in a special format:
The first half stores player IDs,
The second half stores their scores.
Example:
[id1, id2, id3, score1, score2, score3]
Your job is to “shuffle” this array by pairing each player with their score in order:
[id1, score1, id2, score2, id3, score3] */

class test4
{

    public static void main(String[] args) {
    int num[]={2, 5, 1, 3, 4, 7};
    int n=3;

    for(int i=0;i<num.length;i++)
    {
        if(i<n)
        {
            System.out.print(num[i]+" ");
            System.out.print(num[i+n]+" ");
    }
    }
   
    }
}