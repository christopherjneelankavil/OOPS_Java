//To write a program that shows the usage of try catch and finally

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Program to perform division");
            System.out.println("Enter number 1 and number 2: ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int result=num1/num2;
            System.out.println("Result = "+result);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
            System.out.println("End of operation");
        }
    }
}

//Output

// Program to perform division
// Enter number 1 and number 2:
// 10
// 5
// Result = 2
// End of operation

// Program to perform division
// Enter number 1 and number 2:
// 5
// 0
// / by zero
// End of operation


// Algorithm for Exception Handling

// Step 1: Start

// Step 2: Initialize Scanner
//     2.1: Create a Scanner object (`sc`) to read input from the user.

// Step 3: Try Block
//     3.1: Enter a try block to handle potential exceptions.
//     3.2: Print "Program to perform division".
//     3.3: Prompt the user to "Enter number 1 and number 2".
//     3.4: Read two integers (`num1` and `num2`) from the user.
//     3.5: Perform division (`result = num1 / num2`).
//     3.6: Print the result.

// Step 4: Catch Block (ArithmeticException)
//     4.1: If an ArithmeticException occurs, catch the exception.
//     4.2: Print the exception message using `e.getMessage()`.

// Step 5: Finally Block
//     5.1: Close the Scanner (`sc`) in the finally block to ensure proper resource management.
//     5.2: Print "End of operation".

// Step 6: End
