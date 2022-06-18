package exercises;

import java.util.Scanner;
//                                          PseudoCode:
//        @DisplayNAme:("This program prompts user to input a score and prints out pass or fail")
//                        Prompt user to input a score number using the keyboard
//                        Store user input
//                        Score users according to their score to determine if they pass or fail
//                          if score is greater or equal to 55, output Pass
//                          if score is lesser than 55 output Fail.

public class ScoreApp {
    public static void main(String[] args) {
        //prompt user to input a score number using the keyboard
        Scanner input = new Scanner(System.in);
            System.out.print("Enter score: ");
        //Store user input
            double userScore = input.nextDouble();
        //Score users according to their score to determine if they pass or fail
        if (userScore >= 55){
            System.out.println("Pass");
        }
        if (userScore < 55){
            System.out.println("Fail");
        }
    }
}
