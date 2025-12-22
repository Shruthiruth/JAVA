
import java.util.Random;
import java.util.Scanner;

//rock paper scissors game
class test8
{

     static String getChoice(char c)
        {
            if (c == 'R') return "Rock";
            if (c == 'S') return "Scissor";
            if (c == 'P') return "Paper";
            return "Invalid";
        }

        static int checkWinner(char p1,char p2)
        {
            if(p1 == p2) return 0; //tie
            if((p1 == 'R' && p2 == 'S') ||
              (p1 == 'S' && p2 == 'P') ||
              (p1 == 'P' && p2 == 'R'))
              return 1;
            return 2;
        }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to rock paper scissor game, let's get started---");

        System.out.println("Enter number of player (1 or 2): " );
        int Player=scanner.nextInt();

        System.out.println("Enter number of rounds : ");
        int Round=scanner.nextInt();

        int Score1=0;
        int Score2=0;

        for(int r=1;r<=Round;r++)
        {
            System.out.println("Round"+r);
            System.out.println("Player1 please type R/P/S/Q  [(R-Rock/S-Scissor/P-Paper or Q-Quit)]: ");

            char p1 = scanner.next().toUpperCase().charAt(0);

            if (p1 == 'Q') {
                System.out.println("Game exited by user");
                break;
            }

            char p2;
            if(Player==1)
            {
                char[] option={'R','S','P'};
                p2 = option[random.nextInt(3)];
                System.out.println("computer choice : "+getChoice(p2));
            }
            else
            {
                System.out.println("Player 2 please type R/P/S/Q  [(R-Rock/S-Scissor/P-Paper or Q-Quit)]:");
                p2=scanner.next().toUpperCase().charAt(0);
            }


            int result = checkWinner(p1, p2);

            if(result == 0)
            {
                System.out.println("Tie");
            }
            else if(result == 1)
            {
                System.out.println("Player 1 wins");
                Score1++;
            }
            else 
            {
                System.out.println("Player 2 wins");
                Score2++;
            }

            System.out.println("Player 1 score is : "+Score1+ " and Player 2 score is : "+Score2);
        }
            System.out.println("Game Over");
            if(Score1 > Score2)
            {
                System.out.println("Final winner is player 1---Kudoos to Player 1");
            }
            else if(Score2 > Score1)
            {
                System.out.println("Final winner is player 2---Kudoos to Player 2");
            }
            else
            {
                System.out.println("Final winner is player 1 and Player 2---it's a tie Please play again");
            }
            
       
      
    }
}