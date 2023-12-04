//Java program for bubble sort

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");//no.of elements
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elemets: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The array entered is : ");
        printArray(arr, size);
        System.out.println("The sorted array is : ");
        bubbleSort(arr,size);
        printArray(arr, size);
    }
    public static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

// Output

// Enter the size of the array : 
// 5
// Enter the elemets:
// 43
// 1
// 67
// 3
// 90
// The array entered is :
// 43 1 67 3 90
// The sorted array is :
// 1 3 43 67 90


// Algorithm for Bubble Sort

// Step 1: Start

// Step 2: Initialize Scanner
//     2.1: Create a Scanner object (`sc`) to read input from the user.

// Step 3: Input Size of Array
//     3.1: Prompt the user to "Enter the size of the array".
//     3.2: Read the size of the array (`size`) from the user.

// Step 4: Initialize and Input Array Elements
//     4.1: Declare an array `arr` of size `size`.
//     4.2: Prompt the user to "Enter the elements".
//     4.3: Use a loop to read the elements of the array from the user.
//     4.4: Close the Scanner (`sc`).

// Step 5: Print Original Array
//     5.1: Print "The array entered is : ".
//     5.2: Call the `printArray` function to print the original array.

// Step 6: Bubble Sort
//     6.1: Call the `bubbleSort` function with parameters `arr` and `size` to sort the array using the Bubble Sort algorithm.

// Step 7: Print Sorted Array
//     7.1: Print "The sorted array is : ".
//     7.2: Call the `printArray` function to print the sorted array.

// Step 8: End

// Function printArray(arr, size):
//     8.1: Use a loop to iterate through the elements of the array.
//     8.2: Print each element.

// Function bubbleSort(arr, size):
//     8.3: Use two nested loops to iterate through the array.
//         8.3.1: In the inner loop, compare adjacent elements.
//         8.3.2: If the current element is greater than the next element, swap them.
//     8.4: Repeat this process for each element in the array, effectively moving the largest unsorted element to its correct position.
//     8.5: Continue this process until the entire array is sorted.

