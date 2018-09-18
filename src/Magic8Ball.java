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

        if (testing<11 ) {
            System.out.println("The outcome looks promising.");
        }

        else if(testing<21){
            System.out.println("I wouldn't bet on it.");
            }

        else if(testing<31){
            System.out.println("Absolutely.");
        }

        else if(testing<41){
            System.out.println("Not now.");
        }

        else if(testing<51){
            System.out.println("Wait for it.");
        }

        else if(testing<61){
            System.out.println("Yes.");
        }

        else if(testing<71){
            System.out.println("Dosen't seem likely");
        }

        else if(testing<81){
            System.out.println("Without a doubt.");
        }

        else if(testing<91){
            System.out.println("No.");
        }

        else if(testing<101){
            System.out.println("Count on it.");
        }

    }

}
