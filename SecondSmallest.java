public class SecondSmallest {
    public static int getSecondSmallest(int arr[],int size){
        for(int i=0;i<=size-2;i++){
            for(int j=i+1;j<=size-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[1];
    }
    public static void main(String[] args) {
        int a[]={2,5,6,3,4};
        int b[]={44,55,67,74,12,81,14};
        System.out.println("The second smallest number in the first array: "+getSecondSmallest(a,5));
        System.out.println("The second smallest number in the second array: "+getSecondSmallest(b,7));
    }
}

// Ouput

// The second smallest number in the first array: 3
// The second smallest number in the second array: 14


// Algorithm for Finding Second Smallest Number in an Array

// Step 1: Start

// Step 2: Define getSecondSmallest function
//     2.1: Function getSecondSmallest(arr, size)
//         2.1.1: Iterate through the array using two nested loops (i and j).
//         2.1.2: Compare each element with every other element in the array.
//         2.1.3: If the current element is greater than the element being compared, swap them.
//         2.1.4: After the loops, return the element at index 1, which is the second smallest element.

// Step 3: Initialize arrays
//     3.1: Initialize array a with elements [2, 5, 6, 3, 4]
//     3.2: Initialize array b with elements [44, 55, 67, 74, 12, 81, 14]

// Step 4: Display Result
//     4.1: Print "The second smallest number in the first array: " followed by the result of getSecondSmallest(a, 5).
//     4.2: Print "The second smallest number in the second array: " followed by the result of getSecondSmallest(b, 7).

// Step 5: End
