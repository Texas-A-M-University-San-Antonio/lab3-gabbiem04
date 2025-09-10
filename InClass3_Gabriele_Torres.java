/**
 * Name: Gabriele Torres
 * Date: 09 September 2025
* Purpose: InClass 3 - Calculate the Volume and Surface Area of the Cube using user input and variables
* This program demonstrates how to use user input, mathematical methods (Math pow), 
* and output to calculate the volume and surface area of a cube.
 */

// Don't forget to import and declare a Scanner for user input.

import java.util.Scanner;

public class InClass3_Gabriele_Torres
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        
        System.out.println("Please enter the length of the cube:");
        
        // Step 2: Read the user's input and store it in a variable.
       
        double length = input.nextDouble();

        // Step 3: Use an appropriate method to determine the volume of the cube.
        // volume = length^3

        double volume = Math.pow(length, 3);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        // surfaceArea = 6 * length^2

        double surfaceArea = 6 * Math.pow(length, 2);
        
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        
        // Step 5: Print the volume and surface area in clear sentences.

        System.out.println("The volume of the cube is: " + volume);

        System.out.println("The surface area of the cube is: " + surfaceArea);
    
    }
}