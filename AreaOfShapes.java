// Write a program to calculate the area of different shapes namely circle,rectangle,triangle using the 
// concept of method overloading
class AreaDemo{
    void area(double x){
        System.out.println("The area of rectangle is : "+3.14*x*x+" sq.units");
    }
    void area(float x, float y){
        System.out.println("The area of rectangle is : "+x*y+" sq.units");
    }
    void area(float x){
        System.out.println("The area of square is : "+x*x+" sq.units");
    }
}
public class AreaOfShapes {
    public static void main(String[] args) {
        AreaDemo shapes =new AreaDemo();
        shapes.area(5);
        shapes.area(11, 12);
        shapes.area(2.5);
    }
}

// Output

// The area of square is : 25.0 sq.units
// The area of rectangle is : 132.0 sq.units
// The area of rectangle is : 19.625 sq.units


// Algorithm for Area Of Shapes

// Step 1: Define the AreaDemo class
//     1.1: Declare class AreaDemo
//     1.2: Declare a method `area` with a parameter of type double to calculate the area of a circle
//         1.2.1: Print "The area of rectangle is : " followed by the formula 3.14 * x * x
//     1.3: Declare a method `area` with parameters of type float to calculate the area of a rectangle
//         1.3.1: Print "The area of rectangle is : " followed by the formula x * y
//     1.4: Declare a method `area` with a parameter of type float to calculate the area of a square
//         1.4.1: Print "The area of square is : " followed by the formula x * x

// Step 2: Define the AreaOfShapes class
//     2.1: Declare a public class AreaOfShapes
//     2.2: Inside the main method:
//         2.2.1: Create an instance of the AreaDemo class named `shapes`
//         2.2.2: Call the `area` method with a single parameter of type double (circle area) using the instance `shapes`
//             2.2.2.1: This will print the area of a circle using the formula 3.14 * x * x
//         2.2.3: Call the `area` method with two parameters of type float (rectangle area) using the instance `shapes`
//             2.2.3.1: This will print the area of a rectangle using the formula x * y
//         2.2.4: Call the `area` method with a single parameter of type float (square area) using the instance `shapes`
//             2.2.4.1: This will print the area of a square using the formula x * x

// Step 3: End
