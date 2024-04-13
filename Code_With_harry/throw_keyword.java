package Code_With_harry;

import java.util.Scanner;

public class throw_keyword extends RuntimeException {

    throw_keyword(String msg){
        super(msg);
    }
}

class voting{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if(age<18){
            throw new throw_keyword("You are not eligible for vote");
        }
        else{
            System.out.println("You can vote");
        }
    }
}
