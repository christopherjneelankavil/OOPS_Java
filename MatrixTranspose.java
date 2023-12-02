public class MatrixTranspose {
    public static void main(String[] args) {
        int original[][] = {{1, 4, 9}, {2, 4, 8}, {3, 6, 9}};
        int transpose[][] = new int[3][3]; 

        // Transposing the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }

        // Printing the original matrix
        System.out.println("Original Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");  
            }
            System.out.println();  
        }

        // Printing the transpose matrix
        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");  
            }
            System.out.println();  
        }
    }
}


// Output

// Original Matrix: 
// 1 4 9 
// 2 4 8
// 3 6 9
// Transpose Matrix:
// 1 2 3
// 4 4 6
// 9 8 9

// Algorithm for Matrix Transpose

// Step 1: Start

// Step 2: Initialize the original matrix
//     2.1: Declare a 2D array `original` and initialize it with the original matrix values.

// Step 3: Initialize the transpose matrix
//     3.1: Declare a new 2D array `transpose` to store the transposed matrix.

// Step 4: Transpose the matrix
//     4.1: Use nested loops to iterate through each element of the original matrix.
//     4.2: Assign the value of `original[j][i]` to `transpose[i][j]`, effectively swapping rows and columns.

// Step 5: Print the original matrix
//     5.1: Print "Original Matrix: " to indicate the original matrix is being printed.
//     5.2: Use nested loops to iterate through the original matrix and print each element.

// Step 6: Print the transpose matrix
//     6.1: Print "Transpose Matrix: " to indicate the transposed matrix is being printed.
//     6.2: Use nested loops to iterate through the transpose matrix and print each element.

// Step 7: End
