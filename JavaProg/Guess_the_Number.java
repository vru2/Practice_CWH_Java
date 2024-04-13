package JavaProg;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputnumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;

    }


    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();

    }

    boolean isCorrectNumber(){
        noOfGuesses ++;
        if (inputnumber==number){
            System.out.format("Yes you guessed it right, it was %d\n, You gessed it in %d attempts", number,noOfGuesses);
            return true;
        } else if (inputnumber<number) {
            System.out.println("Too Low");

        }
        else if (inputnumber>number) {
            System.out.println("Too High");

        }
        return false;

    }

}

public class Guess_the_Number {
    public static void main(String[] args) {
        /*
        Create a class game, which allows user to "Guess the Number"
        game once.game should have the following methods:
        1. Constructor to guess the random number
        2. takeuserinput(). to take a user input of number
        3. iscorrectnumber(). to detect the number entered by user is true
        4. getters and setters for noofguesses
        Use properties such as noofguesses(int),etc to get this task done!
         */

        Game g = new Game();
        boolean b= false;
        while(!b) {
            g.takeUserInput();
            b= g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
