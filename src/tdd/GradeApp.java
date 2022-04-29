package tdd;

//                                          PseudoCode:
//      @DisplayName:("This program test score and grade the student according to the score range")
//                      Prompt the student to input a score using the keyboard
//                      Store the score number
//                      Output the different grades of the student as A, B, C, D and F:
//                          if student score is greater and equal to 90 and student score is lesser that and equal to 100 output grade A;
//                          if student score is greater and equal to 80 and student score is lesser than 90 output grade B;
//                          if student score is greater and equal to 70 and student score is lesser than 80 output grade C;
//                          if student score is greater and equal to 60 and student score is lesser than 70, output grade D;
//                          if student score is lesser than 60 output grade F;

import java.util.Scanner;

public class GradeApp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter student score: ");
            double studentScore = input.nextDouble();
        if (studentScore >= 90 && studentScore <= 100){
            System.out.println("Grade A");
        }
        if (studentScore >= 80 && studentScore < 90){
            System.out.println("Grade B");
        }
        if (studentScore >= 70 && studentScore < 80){
            System.out.println("Grade C");
        }
        if (studentScore >= 60 && studentScore < 70){
            System.out.println("Grade D");
        }
        if (studentScore <60){
            System.out.println("Grade F");
        }
    }
}
