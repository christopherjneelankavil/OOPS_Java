import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try{
            FileReader fin_1=new FileReader("File1.txt");
            FileReader fin_2=new FileReader("File2.txt");
            FileWriter fout= new FileWriter("File3.txt");
            int i;
            while ((i=fin_1.read())!=-1) {
                fout.write(i);
                System.out.print((char)i);
            }
            while ((i=fin_2.read())!=-1) {
                fout.write(i);
                System.out.print((char)i);
            }
            fin_1.close();
            fin_2.close();
            fout.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

// Output

// Hello World!
// Nice to meet you.This is java program for file handling.


// Algorithm for File Handling

// Step 1: Start

// Step 2: Try Block
//     2.1: Enter a try block to handle potential IOException.
//     2.2: Create FileReader objects (`fin_1` and `fin_2`) for reading from "File1.txt" and "File2.txt".
//     2.3: Create a FileWriter object (`fout`) for writing to "File3.txt".
//     2.4: Declare a variable `i` to store the read character.
//     2.5: Use a while loop to read characters from "File1.txt" using `fin_1`.
//         2.5.1: Write each character to "File3.txt" using `fout`.
//         2.5.2: Print each character to the console.
//     2.6: Use another while loop to read characters from "File2.txt" using `fin_2`.
//         2.6.1: Write each character to "File3.txt" using `fout`.
//         2.6.2: Print each character to the console.
//     2.7: Close FileReader and FileWriter objects.

// Step 3: Catch Block (IOException)
//     3.1: If an IOException occurs, catch the exception.
//     3.2: Print the exception message using `e.getMessage()`.

// Step 4: End
