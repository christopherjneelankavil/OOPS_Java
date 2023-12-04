import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("File4.txt"));
            String s = br.readLine();
            br.close();

            StringTokenizer st = new StringTokenizer(s);
            int num, sum = 0;
            while (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
                System.out.println(num);
                sum += num;
            }

            System.out.println("Sum = " + sum);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing an integer: " + e.getMessage());
        }
    }
}


// Output

// 10
// 20
// 30
// 40
// 50
// Sum = 150


// Algorithm for StringToken

// Step 1: Start

// Step 2: Try Block
//     2.1: Enter a try block to handle potential IOException and NumberFormatException.
//     2.2: Create a BufferedReader (`br`) using FileReader for reading from "File4.txt".
//     2.3: Read a line from the file and store it in a String variable (`s`).
//     2.4: Close the BufferedReader (`br`).
//     2.5: Create a StringTokenizer (`st`) using the read line.

// Step 3: Process Tokens
//     3.1: Declare variables `num` and `sum`.
//     3.2: Use a while loop to iterate through tokens using `st.hasMoreTokens()`.
//         3.2.1: Parse the next token as an integer (`num = Integer.parseInt(st.nextToken())`).
//         3.2.2: Print the parsed integer to the console.
//         3.2.3: Add the parsed integer to the sum.
//     3.3: Print the total sum.

// Step 4: Catch Block (IOException)
//     4.1: If an IOException occurs, catch the exception.
//     4.2: Print an error message indicating the issue with reading the file.

// Step 5: Catch Block (NumberFormatException)
//     5.1: If a NumberFormatException occurs, catch the exception.
//     5.2: Print an error message indicating the issue with parsing an integer.

// Step 6: End
