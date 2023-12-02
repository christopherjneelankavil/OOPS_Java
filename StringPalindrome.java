import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str= sc.nextLine();
        boolean flag=false;
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Not a palindrome");
        }
        else{
            System.out.println("It is a palindrome");
        }
        sc.close();
    }    
}

//Output

// Enter the string : 
// malayalam
// It is a palindrome

// Enter the string : 
// animal
// Not a palindrome

// Algorithm for String Palindrome Check

// Step 1: Start

// Step 2: Initialize Scanner
//     2.1: Create a Scanner object (`sc`) to read input from the user.

// Step 3: Prompt for Input
//     3.1: Print "Enter the string : " to prompt the user for a string input.

// Step 4: Read Input
//     4.1: Read the input string from the user using `sc.nextLine()` and store it in the variable `str`.

// Step 5: Initialize Variables
//     5.1: Initialize a boolean variable `flag` to false, which will be used to determine if the string is a palindrome.
//     5.2: Get the length of the input string and store it in the variable `len`.

// Step 6: Check for Palindrome
//     6.1: Use a for loop to iterate through the characters of the string.
//         6.1.1: Compare the characters at the corresponding positions from the start and end of the string.
//         6.1.2: If any pair of characters are not equal, set the `flag` to true and break out of the loop.

// Step 7: Display Result
//     7.1: Check the value of `flag`.
//         7.1.1: If `flag` is true, print "Not a palindrome."
//         7.1.2: If `flag` is false, print "It is a palindrome."

// Step 8: Close Scanner
//     8.1: Close the Scanner using `sc.close()`.

// Step 9: End
