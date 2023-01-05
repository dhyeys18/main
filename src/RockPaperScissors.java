import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int user;
        int CompScore=0;
        int UserScore=0;
        int NumberOfPasses;
        int CurrentPass=0;

        System.out.println("Enter Number of Passes you want to play");
        NumberOfPasses=sc.nextInt();




        Random r= new Random();
        int comp= r.nextInt(1,4);
        logic:
        {
            while (CurrentPass != NumberOfPasses) {
                System.out.println("\n");
                System.out.println("Welcome to the Game");
                System.out.println("Enter your Input");
                System.out.println("Enter 1 for Rock\nEnter 2 for Paper\nEnter 3 for Scissors");
                user = sc.nextInt();

                if (user > 3) {
                    System.out.println("Invalid Input");
                    CurrentPass--;

                }

                if (user == comp) {
                    System.out.println("Pass Tied");
                } else if (comp == 1) {
                    if (user == 2) {
                        System.out.println("User won in this pass");
                        UserScore++;
                    } else {
                        System.out.println("Computer Won in this pass");
                        CompScore++;
                    }
                } else if (comp == 2) {
                    if (user == 1) {
                        System.out.println("Computer won in this pass");
                        CompScore++;
                    } else {
                        System.out.println("User Won in this pass");
                        UserScore++;
                    }
                } else if (comp == 3) {
                    if (user == 1) {
                        System.out.println("User won in this pass");
                        UserScore++;
                    } else {
                        System.out.println("Computer Won in this pass");
                        CompScore++;
                    }
                }

                CurrentPass++;
            }
        }

        System.out.println("Results:");
        if (UserScore>CompScore)
        {
            System.out.println("User Won");
        }

        else if (CompScore>UserScore)
        {
            System.out.println("Computer Won");
        }

        else
        {
            System.out.println("Game Tied");
        }


    }
}
