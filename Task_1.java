
import java.util.Random;
import java.util.Scanner;
//number guessing game for Oasis infobyte
    public class Task_1 {

        public static void main(String[] args) {
            Random Random_number= new Random();
            int right_guess=Random_number.nextInt(100);
            int turns=0;
            Scanner Scan=new Scanner(System.in);
            System.out.println("Guess a number between 1 to 100, You will have 10 turns! \n" );
            System.out.println("All the best..!! \nPlay game enter the number");


            int guess;
            int i=0;
            boolean win=false;
            while(win==false) {
                guess=Scan.nextInt();
                turns++;

                if(guess==right_guess) {
                    win=true;
                }
                else if(i>9){
                    System.out.println("You loose! the right answer was: "+right_guess);
                    return;
                }
                else if(guess<right_guess){
                    i++;
                    System.out.println("Your Guess is lower than the right number! Turns left: " +(10-i) +"\n");



                }
                else if(guess>right_guess) {
                    i++;
                    System.out.println("Your guess is higher than the right number! Turns left: " +(10-i) +"\n");

                }

            }
            System.out.println("YOu win!");
            System.out.println("Then number was "+right_guess);
            System.out.println("\n You used "+turns+" turns to guess the right number");
            System.out.println("Your score is "+((11-turns)*10)+" out of 100");


        }
    }
