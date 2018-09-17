import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){
        //declare
        Scanner keyboard;
        int testing;
        String question;

        //initialization
        keyboard = new Scanner(System.in);

        System.out.println("What is your question for the Magic 8 Ball?");
        question = keyboard.nextLine();
        System.out.println("Alright got it, now input a number between 1 and 100.");
        testing = keyboard.nextInt();






    }

}
