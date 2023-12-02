import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of m1 :");
        int m1 = sc.nextInt();
        System.out.println("Enter the order of n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the order of m2: ");
        int m2 = sc.nextInt();
        System.out.println("Enter the order of n2: ");
        int n2 = sc.nextInt();

        if (n1 != m2) {
            System.out.println("Matrix multiplication is not possible");
            sc.close();
            return;
        }

        int A[][] = new int[m1][n1];
        int B[][] = new int[m2][n2];
        int C[][] = new int[m1][n2];

        System.out.println("Enter the elements in the first array: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements in the second array: ");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n1; k++) {
                    C[i][j] += A[i][k] * B[k][j];  
                }
            }
        }

        System.out.println("Resultant matrix: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Output

// Enter the order of m1 :
// 2
// Enter the order of n1:
// 2
// Enter the order of m2:
// 2
// Enter the order of n2:
// 2
// Enter the elements in the first array:
// 1
// 2
// 1
// 2
// Enter the elements in the second array:
// 1
// 2
// 1
// 2
// Resultant matrix:
// 3 6
// 3 6

// Algorithm for Matrix Multiplication

// Step 1: Start

// Step 2: Initialize Scanner
//     2.1: Create a Scanner object (`sc`) to read input from the user.

// Step 3: Input Matrix Order
//     3.1: Prompt the user to enter the order (rows and columns) of the first matrix (m1, n1).
//     3.2: Prompt the user to enter the order (rows and columns) of the second matrix (m2, n2).

// Step 4: Check Validity for Multiplication
//     4.1: If the number of columns of the first matrix (n1) is not equal to the number of rows of the second matrix (m2),
//          print "Matrix multiplication is not possible" and end the program.

// Step 5: Initialize Matrices
//     5.1: Declare and initialize 2D arrays A, B, and C to store the elements of the two input matrices and the result matrix.

// Step 6: Input Elements for Matrices A and B
//     6.1: Prompt the user to enter the elements of the first matrix (A).
//     6.2: Prompt the user to enter the elements of the second matrix (B).

// Step 7: Matrix Multiplication
//     7.1: Use nested loops to perform matrix multiplication:
//          7.1.1: For each element C[i][j], iterate through the row of A and the column of B, accumulating the product.

// Step 8: Display Result
//     8.1: Print "Resultant matrix: ".
//     8.2: Use nested loops to iterate through the result matrix (C) and print each element.

// Step 9: Close Scanner
//     9.1: Close the Scanner using `sc.close()`.

// Step 10: End

