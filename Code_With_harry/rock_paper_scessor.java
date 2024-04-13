package Code_With_harry;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class rock_paper_scessor {
    public static void main(String[] args) {

        System.out.println("1--> Rock");
        System.out.println("2--> Paper");
        System.out.println("3--> Scissor");

        System.out.println("Enter the number 1, 2 or 3");

        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        if (user_input ==1){
            System.out.println("User select Rock");
        }
        if (user_input ==2){
            System.out.println("User select paper");
        }
        if (user_input ==3){
            System.out.println("User select Scissor");
        }

        System.out.println("Computer input: ");
        Random r = new Random();
        int computer_choise = r.nextInt(1,4);
        if (computer_choise==1){
            System.out.println("Computer selects Rock");
        }
        if (computer_choise==2){
            System.out.println("Computer selects paper");
        }
        if (computer_choise==3){
            System.out.println("Computer selects scissor");
        }

        //game on
        if (user_input==1 && computer_choise==2){
            System.out.println("Computer wins");
        }
        if (user_input==2 && computer_choise==3){
            System.out.println("Computer wins");
        }
        if (user_input==3 && computer_choise==1){
            System.out.println("Computer wins");
        }
        if (user_input==2 && computer_choise==1){
            System.out.println("User wins");
        }
        if (user_input==3 && computer_choise==2){
            System.out.println("Computer wins");
        }
        if (user_input==3 && computer_choise==1){
            System.out.println("Computer wins");
        }
        else{
            System.out.println("Tie, play again");
        }
    }
}
