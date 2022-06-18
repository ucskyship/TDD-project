package exercises;

import java.util.Scanner;

public class AccountTest1 {

    public static void main(String... args){
        // create a Scanner object to obtain input from te command window
        Scanner input = new Scanner(System.in);

        //creat an Account object and assign it to myAccount
        Account1 myAccount = new Account1();

        //display initial value of name (null)
        System.out.printf("Initial name is: %s\n\n", myAccount.getName());

        //prompt for te read name
        System.out.println("Please enter the name: ");
        String theName = input.nextLine();  //read a line of text
        myAccount.setName((theName));   //outputs a blank line

        //display the name stored in object myAccount
        System.out.println();   //outputs a blank line

        //display the name stored in object myAccount
        System.out.printf("Name in object myAccount is: \n%s\n", myAccount.getName());
    }
}
