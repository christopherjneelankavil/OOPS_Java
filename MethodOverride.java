// Write two java classes Employee and Engineer .Engineer should inherit from Employee class. Employee
// class should have the methods display() and calcSalary(). Write a java program to display the Engineer
// salary and Employee class. Display prints name of the class calcSalary displays salary of the employee
class Employee{
    double salary=10000;
    void display()
    {
        System.out.println("Name of the class is Employee");
    }
    void calcSalary(double salary)
    {
        System.out.println("Salary of employee is : "+salary);
    }
}
class Engineer extends Employee
{
    void calcSalary(double salary)
    {
        System.out.println("The Salary of engineer is  : "+salary);
    }
    void calcSalary()
    {
        super.calcSalary(salary);
    }
}

public class EmpOver {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Engineer eng = new Engineer();
        emp.display();
        eng.calcSalary();
        eng.calcSalary(20000);
    }
}
/*OUTPUT-->
Name of the class is Employee
Salary of employee is : 10000.0
The Salary of engineer is  : 20000.0*/
// Algorithm for Method Override

// Step 1: Define the Employee class
//     1.1: Declare class Employee
//     1.2: Declare method `display()` to print "Name of the class employee"
//     1.3: Declare method `calcSalary()` to print "Salary of the employee is 10000"

// Step 2: Define the Engineer class
//     2.1: Declare class Engineer extending Employee
//     2.2: Override the `calcSalary()` method in the Engineer class to print "Salary of the engineer is 20000"

// Step 3: Define the MethodOverride class
//     3.1: Declare a public class MethodOverride
//     3.2: Inside the main method:
//         3.2.1: Create an instance of Employee and assign it a reference to an Engineer object (Polymorphism)
//         3.2.2: Call the `display()` method on the instance, which will print "Name of the class employee"
//         3.2.3: Call the `calcSalary()` method on the instance, which will invoke the overridden method in Engineer
//             3.2.3.1: The overridden method in Engineer prints "Salary of the engineer is 20000"

// Step 4: End
