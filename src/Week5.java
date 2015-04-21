/**
 * Created by miniMoimartz on 4/20/15.
*/
import java.util.Scanner;

public class Week5 {


    public static void main(String[] args) {
        /* program that reads a series of 10 integers from the user
         * and prints their average. Read each input value as a string,
         * and then attempt to convert it to an integer using the Integer.
         * parseInt method.If this process throws a NumberFormatException
         * (meaning that the input is not a valid number), print an
         * appropriate error message and prompt for the number again.
         * Continue reading values until 10 valid integers have been entered.
         */

        //create scanner object
        Scanner scan = new Scanner(System.in);
        //hold integer values
        Integer[] numIntegerArray = new Integer[10];
        //hold string value before turning into integer
        String holdString = "";

        //first take in string
        //then convert to integer
        //if


        while (numIntegerArray.length == 10) {
            try {

                for (int i = 0; i < 10; i++) {
                    //use loop to read integer value from user 1-10
                    System.out.print("Please enter your number: ");
                    //attempt to convert string to integer
                    //and place in integer array
                    holdString = scan.nextLine();

                    //if holdstring is not numeric then do not add to array
                    if (holdString.equals("")) {

                    }
                    numIntegerArray[i] = Integer.parseInt(scan.nextLine());
                }

            } catch (NumberFormatException exception) {
                System.out.println("Input entered is not numeric.");
            } finally {
                System.out.println("Number of values entered: " + numIntegerArray.length);
            }
        }
    }
}


