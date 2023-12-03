// Write a java program to create an abstract class named Shape that contains an 
// empty method named numberOfSides( ). Provide three classes named Rectangle, Triangle 
// and Hexagon such that each one of the classes extends the class Shape. 
// Each one of the classes contains only the method numberOfSides( ) that shows the 
// number of sides in the given geometrical structures.

abstract class Shape{
    public abstract void numberOfSides();
}
class Rectangle extends Shape{
    public void numberOfSides(){
        System.out.println("Number sides of rectangle = 4");
    }
}
class Triangle extends Shape{
    public void numberOfSides(){
        System.out.println("Number of sides of triangle = 3");
    }
}
class Hexagon extends Shape{
    public void numberOfSides(){
        System.out.println("Number of sides of hexagon = 6");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
     
}

// Output

// Number sides of rectangle = 4
// Number of sides of triangle = 3
// Number of sides of hexagon = 6

// Algorithm for Abstract Class

// Step 1: Define the Shape abstract class
//     1.1: Declare an abstract class Shape
//     1.2: Declare an abstract method `numberOfSides()` in the Shape class

// Step 2: Define the Rectangle class
//     2.1: Declare class Rectangle extending Shape
//     2.2: Implement the `numberOfSides()` method in the Rectangle class
//         2.2.1: Print "Number sides of rectangle = 4"

// Step 3: Define the Triangle class
//     3.1: Declare class Triangle extending Shape
//     3.2: Implement the `numberOfSides()` method in the Triangle class
//         3.2.1: Print "Number of sides of triangle = 3"

// Step 4: Define the Hexagon class
//     4.1: Declare class Hexagon extending Shape
//     4.2: Implement the `numberOfSides()` method in the Hexagon class
//         4.2.1: Print "Number of sides of hexagon = 6"

// Step 5: Define the AbstractClass class
//     5.1: Declare a public class AbstractClass
//     5.2: Inside the main method:
//         5.2.1: Create instances of Rectangle, Triangle, and Hexagon classes (r, t, h)
//         5.2.2: Call the `numberOfSides()` method on each instance
//             5.2.2.1: This will invoke the overridden method in the respective classes and print the number of sides

// Step 6: End
