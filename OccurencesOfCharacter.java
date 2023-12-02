import java.util.Scanner;

public class OccurencesOfCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Enter the character to be searched: ");
        char ch=sc.nextLine().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("The character "+ch+" has found "+count+" times");
        sc.close();
    }
}

// Output

// Enter the string: 
// Hello World
// Enter the character to be searched:
// l
// The character l has found 3 times

// Algorithm for Counting Occurrences of Character

// Step 1: Start

// Step 2: Initialize Scanner
//     2.1: Create a Scanner object (`sc`) to read input from the user.

// Step 3: Prompt for String Input
//     3.1: Print "Enter the string: " to prompt the user for a string input.

// Step 4: Read String Input
//     4.1: Read the input string from the user using `sc.nextLine()` and store it in the variable `str`.

// Step 5: Prompt for Character Input
//     5.1: Print "Enter the character to be searched: " to prompt the user for a character input.

// Step 6: Read Character Input
//     6.1: Read a single character input from the user using `sc.nextLine().charAt(0)` and store it in the variable `ch`.

// Step 7: Initialize Counter
//     7.1: Initialize an integer variable `count` to 0, which will be used to count the occurrences of the character.

// Step 8: Count Occurrences
//     8.1: Use a for loop to iterate through the characters of the string.
//         8.1.1: Check if the current character (`str.charAt(i)`) is equal to the specified character (`ch`).
//         8.1.2: If true, increment the `count` variable.

// Step 9: Display Result
//     9.1: Print the result using the format "The character {ch} has found {count} times".

// Step 10: Close Scanner
//     10.1: Close the Scanner using `sc.close()`.

// Step 11: End
