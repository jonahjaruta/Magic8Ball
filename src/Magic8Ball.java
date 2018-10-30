import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){

        //declare
        Scanner keyboard;
        int testing;
        String question;
        int pickedNumber;
        boolean repeat = false;

        while(repeat == false){


            //initialization
        keyboard = new Scanner(System.in);
        pickedNumber = (int) (Math.random() * 100);

        System.out.println("What is your question for the Magic 8 Ball?");
        question = keyboard.nextLine();

        if(pickedNumber<11 ) {
            System.out.println("The outcome looks promising.");
        }

        else if(pickedNumber<21){
            System.out.println("I wouldn't bet on it.");
            }

        else if(pickedNumber<31){
            System.out.println("Absolutely.");
        }

        else if(pickedNumber<41){
            System.out.println("Not now.");
        }

        else if(pickedNumber<51){
            System.out.println("Wait for it.");
        }

        else if(pickedNumber<61){
            System.out.println("Yes.");
        }
        else if(pickedNumber<71){
            System.out.println("Dosen't seem likely");
        }

        else if(pickedNumber<81){
            System.out.println("Without a doubt.");
        }

        else if(pickedNumber<91){
            System.out.println("No.");
        }

        else if(pickedNumber<101){
            System.out.println("Count on it.");
        }

    }}

}
