//Java program for binary search 

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to be searched : ");
        int element=sc.nextInt();
        sc.close();
        int result=binarySearch(arr,0,size-1,element);
        if(result!=-1){
            System.out.println("Element "+element+" found at position : "+(result+1));
        }
        else{
            System.out.println("Element "+element+" not found in the array");
        }

    }
    static int binarySearch(int arr[],int low,int high,int element){
        int mid=(low+high)/2;
        if (low<=high) {
            if(element==arr[mid]){
                return mid;
            }
            else if(element<arr[mid]){
                return binarySearch(arr, low, mid-1, element);
            }
            else if(element>arr[mid]){
                return binarySearch(arr, mid+1, high, element);
            } 
        }
        return -1;
    }
}

// Output

// Enter the size of the array: 7
// Enter the elements:
// 34
// 45
// 78
// 457
// 4678
// 6890
// 35686
// Enter the element to be searched : 35686
// Element 35686 found at position : 7

// Enter the elements:
// 1
// 3
// 5
// 7
// 9
// Enter the element to be searched : 6
// Element 6 not found in the array


// Algorithm for Binary Search

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

// Step 5: Input Element to be Searched
//     5.1: Prompt the user to "Enter the element to be searched".
//     5.2: Read the element to be searched (`element`) from the user.
//     5.3: Close the Scanner (`sc`).

// Step 6: Call Binary Search Function
//     6.1: Call the `binarySearch` function with parameters: `arr`, 0, size-1, and `element`.
//     6.2: Store the result in a variable (`result`).

// Step 7: Display Result
//     7.1: If `result` is not equal to -1, print "Element {element} found at position : {result+1}".
//     7.2: Otherwise, print "Element {element} not found in the array".

// Step 8: End

// Function binarySearch(arr, low, high, element):
//     8.1: Calculate mid as (low + high) / 2.
//     8.2: Check if low is less than or equal to high.
//         8.2.1: If element is equal to arr[mid], return mid (element found).
//         8.2.2: If element is less than arr[mid], recursively call binarySearch with parameters (arr, low, mid-1, element).
//         8.2.3: If element is greater than arr[mid], recursively call binarySearch with parameters (arr, mid+1, high, element).
//     8.3: If the element is not found in the array, return -1.

