import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Array entered is : ");
        printArray(arr,size);
        System.out.println("Sorted array is : ");
        selectionSort(arr,size);
        printArray(arr,size);
    }
    public static void selectionSort(int arr[],int size){
        for(int i=0;i<=size-2;i++){
            for(int j=i+1;j<=size-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

// Output

// Enter the size of the array: 
// 5
// Enter the array elements:
// 12
// 34
// 1
// 345
// 4
// Array entered is :
// 12 34 1 345 4
// Sorted array is :
// 1 4 12 34 345


// Algorithm for Selection Sort

// Step 1: Start

// Step 2: Initialize Scanner
//     2.1: Create a Scanner object (`sc`) to read input from the user.

// Step 3: Input Size of Array
//     3.1: Prompt the user to "Enter the size of the array".
//     3.2: Read the size of the array (`size`) from the user.

// Step 4: Initialize and Input Array Elements
//     4.1: Declare an array `arr` of size `size`.
//     4.2: Prompt the user to "Enter the array elements".
//     4.3: Use a loop to read the elements of the array from the user.
//     4.4: Close the Scanner (`sc`).

// Step 5: Print Original Array
//     5.1: Print "Array entered is : ".
//     5.2: Call the `printArray` function to print the original array.

// Step 6: Selection Sort
//     6.1: Call the `selectionSort` function with parameters `arr` and `size` to sort the array using the Selection Sort algorithm.

// Step 7: Print Sorted Array
//     7.1: Print "Sorted array is : ".
//     7.2: Call the `printArray` function to print the sorted array.

// Step 8: End

// Function selectionSort(arr, size):
//     8.1: Use two nested loops to iterate through the array.
//         8.1.1: In the outer loop, iterate from 0 to size-2.
//         8.1.2: In the inner loop, iterate from i+1 to size-1.
//         8.1.3: If arr[i] is greater than arr[j], swap the elements.
//     8.2: Repeat this process for each element in the array, effectively finding the minimum element in the unsorted part and moving it to the sorted part.

// Function printArray(arr, size):
//     8.3: Use a loop to iterate through the elements of the array.
//     8.4: Print each element.

