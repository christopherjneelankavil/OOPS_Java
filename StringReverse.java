import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string to be reversed : ");
        String original=sc.nextLine();
        String reverse="";
        int len=original.length();
        for(int i=0;i<len;i++){
            reverse+=original.charAt(len-i-1);
        }
        sc.close();
        System.out.println("Original string : "+original);
        System.out.println("Reversed string : "+reverse);
    }
}

// Output

// Enter the string to be reversed : animal
// Original string : animal
// Reversed string : lamina



// Algorithm for StringReverse

// Step 1: Start

// Step 2: Initialize Scanner
//     2.1: Create a Scanner object (`sc`) to read input from the user.

// Step 3: Input Original String
//     3.1: Prompt the user to "Enter the string to be reversed".
//     3.2: Read the original string (`original`) from the user using `sc.nextLine()`.

// Step 4: Reverse the String
//     4.1: Initialize an empty string (`reverse`) to store the reversed string.
//     4.2: Get the length of the original string (`len`).
//     4.3: Use a for loop to iterate through each character of the original string.
//         4.3.1: Append the character at the reversed position to the `reverse` string.
//             (e.g., `reverse += original.charAt(len - i - 1)`).

// Step 5: Close Scanner
//     5.1: Close the Scanner (`sc`).

// Step 6: Print Original and Reversed Strings
//     6.1: Print "Original string : " followed by the original string.
//     6.2: Print "Reversed string : " followed by the reversed string.

// Step 7: End
