import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.println("The sum of "+num1+" and "+num2+" is "+(num1+num2));
        sc.close();
    }
}

// Output

// Enter the first number : 
// 4
// Enter the second number:
// 5
// The sum of 4 and 5 is 9


// Algorithm for Adding Two Numbers

// Step 1: Start

// Step 2: Initialize Scanner
//     2.1: Create a Scanner object (`sc`) to read input from the user.

// Step 3: Prompt for First Number
//     3.1: Print "Enter the first number : " to prompt the user for the first number.

// Step 4: Read First Number
//     4.1: Read the first number from the user using `sc.nextInt()` and store it in the variable `num1`.

// Step 5: Prompt for Second Number
//     5.1: Print "Enter the second number: " to prompt the user for the second number.

// Step 6: Read Second Number
//     6.1: Read the second number from the user using `sc.nextInt()` and store it in the variable `num2`.

// Step 7: Calculate Sum
//     7.1: Calculate the sum of `num1` and `num2` and store it in a temporary variable.

// Step 8: Display Result
//     8.1: Print the result using the format "The sum of {num1} and {num2} is {sum}".

// Step 9: Close Scanner
//     9.1: Close the Scanner using `sc.close()`.

// Step 10: End
