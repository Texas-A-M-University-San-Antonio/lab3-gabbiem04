/*
 * Name: Gabriele Torres
 * Date: 09 September 2025
* Purpose: Calculate the final value of the home using the formula for compound interest
* This program demonstrates how to use the Scanner class for input, declare and use variables, 
* apply mathematical operations with Math.pow(), and display the results
*/

import java.util.Scanner;

public class Lab3_Gabriele_Torres
{
    public static void main(String[] args) 
    {
        // Step 1: Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Step 2: Declare the variables
        double initialValue;   // Initial value
        int years;             // Number of elapsed years
        double interestRate;   // Interest rate (as a decimal)
        double finalValue;     // Final value 

        // Step 3: Prompt the user to enter the initial value
        System.out.print("Please enter the initial value of the home: "); //this is a string displays the prompt for the user to input the initial value of the home
        initialValue = input.nextDouble();

        // Step 4: Prompt the user for the number of elapsed years
        System.out.print("Please enter the number of elapsed years: "); //this is a string displays the prompt for the user to input the elapsed years
        years = input.nextInt();

        // Step 5: Prompt the user for the interest rate (percentage)
        System.out.print("Please enter interest rate as a number (e.g., 6 for 6%): "); //this is a string displays the prompt for the user to input the interest rate in percentage
        interestRate = input.nextDouble();

        // Step 6: Convert the interest rate from percentage to decimal
        interestRate = interestRate / 100; //this is the formula to convert the interest rate and convert it

        // Step 7: Calculate the final value using compound interest formula
        // A = P * (1 + r)^t
        finalValue = initialValue * Math.pow((1 + interestRate), years); //this is the formula for the final value and calculates it

        // Step 8: Display the result to the user
        System.out.println("The final value of the home is: " + finalValue); //this is a string displays the displays the final value
    }

}