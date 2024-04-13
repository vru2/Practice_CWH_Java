package JavaProg;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {

        // User input
        //System.out.println("Enter User input");
        System.out.println("1--> Rock");
        System.out.println("2--> Paper");
        System.out.println("3--> Scissor");

        System.out.print("Enter the user input 1,2 or 3: ");

        Scanner sc= new Scanner(System.in);
        int user_choise = sc.nextInt();

        if(user_choise == 1){
            System.out.println("User select Rock ");
        }
        if(user_choise == 2){
            System.out.println("User select Paper ");
        }
        if(user_choise == 3){
            System.out.println("User select Scissor ");
        }

        // Computer choise
        Random r = new Random();
        int computer_choise = r.nextInt(1,4);
        System.out.println("Coumputer choise: "+computer_choise);
        if(computer_choise == 1){
            System.out.println("Computer select Rock ");
        }
        if(computer_choise == 2){
            System.out.println("Computer select Paper ");
        }
        if(computer_choise == 3){
            System.out.println("Computer select Scissor ");
        }

        //comparision

        if (user_choise ==1 && computer_choise ==2){
            System.out.println("computer wins");
        } else if (user_choise==1 && computer_choise==3) {
            System.out.println("User wins");
        } else if (user_choise == 2 && computer_choise==3) {
            System.out.println("Computer wins ");
        } else if (user_choise ==2 && computer_choise ==1) {
            System.out.println("User wins");
        } else if (user_choise==3 && computer_choise==1) {
            System.out.println("Computer wins");
        } else if (user_choise == 3 && computer_choise==2) {
            System.out.println("User wins");
        }else{
            System.out.println("Tie, Play again!!!");
        }

    }
}
