// Write a Java program which creates a class named 'Employee' having the following members: 
// Name, Age, Phone number, Address, Salary. It also has a method named 'printSalary( )' 
// which prints the salary of the Employee. Two classes 'Officer' and 'Manager' inherits the 
// 'Employee' class. The 'Officer' and 'Manager' classes have data members 'specialization' 
// and 'department' respectively. Now, assign name, age, phone number, address and salary to 
// an officer and a manager by making an object of both of these classes and print the same

class Employee {
    String name;
    int age;
    String phNo;
    String address;
    double salary;
    void printSalary(){
        System.out.println("Salary "+salary);
    }
}
class Officer extends Employee{
    String specialization;
    Officer(String name,int age,String phNo,String address,double salary,String specialization){
        this.name=name;
        this.age=age;
        this.phNo=phNo;
        this.address=address;
        this.salary=salary;
        this.specialization=specialization;
    }
}
class Manager extends Employee{
    String department;
    Manager(String name,int age,String phNo,String address,double salary,String department){
        this.name=name;
        this.age=age;
        this.phNo=phNo;
        this.address=address;
        this.salary=salary;
        this.department=department;
    }
}
public class EmployeeInheritance {
    public static void main(String[] args) {
        Officer o= new Officer("Officer name", 50, "9384574298", "Officer Address", 48529.904,"Officer Specialization");
        Manager m=new Manager("Manager name", 60, "8445495459", "Manager Address", 68456.429,"Manager Department");

        System.out.println("Officer Details\n");
        System.out.println("Name: "+o.name);
        System.out.println("Age: "+o.age);
        System.out.println("Phone number: "+o.phNo);
        System.out.println("Address: "+o.address);
        System.out.println("Specialization: "+o.specialization);
        o.printSalary();

        System.out.println("\nManager Details\n");
        System.out.println("Name: "+m.name);
        System.out.println("Age: "+m.age);
        System.out.println("Phone number: "+m.phNo);
        System.out.println("Address: "+m.address);
        System.out.println("Department: "+m.department);
        m.printSalary();
    }
}

// Output

// Officer Details

// Name: Officer name
// Age: 50
// Phone number: 9384574298
// Address: Officer Address
// Specialization: Officer Specialization
// Salary 48529.904

// Manager Details

// Name: Manager name
// Age: 60
// Phone number: 8445495459
// Address: Manager Address
// Department: Manager Department
// Salary 68456.429


// Algorithm for Employee Inheritance

// Step 1: Define the Employee class
//     1.1: Declare class Employee
//     1.2: Declare instance variables: name, age, phNo, address, salary
//     1.3: Declare a method `printSalary()` to print the salary
//         1.3.1: Print "Salary" followed by the value of the salary

// Step 2: Define the Officer class
//     2.1: Declare class Officer extending Employee
//     2.2: Declare an additional instance variable `specialization` specific to the Officer class
//     2.3: Create a constructor for Officer
//         2.3.1: Initialize inherited fields (name, age, phNo, address, salary)
//         2.3.2: Initialize the specialization field

// Step 3: Define the Manager class
//     3.1: Declare class Manager extending Employee
//     3.2: Declare an additional instance variable `department` specific to the Manager class
//     3.3: Create a constructor for Manager
//         3.3.1: Initialize inherited fields (name, age, phNo, address, salary)
//         3.3.2: Initialize the department field

// Step 4: Define the EmployeeInheritance class
//     4.1: Declare a public class EmployeeInheritance
//     4.2: Inside the main method:
//         4.2.1: Create an instance of the Officer class with specific details (name, age, phNo, address, salary, specialization)
//         4.2.2: Create an instance of the Manager class with specific details (name, age, phNo, address, salary, department)
//         4.2.3: Print details for the Officer:
//             4.2.3.1: Print "Officer Details"
//             4.2.3.2: Print "Name:", "Age:", "Phone number:", "Address:", "Specialization:"
//             4.2.3.3: Call the `printSalary()` method for the Officer
//         4.2.4: Print details for the Manager:
//             4.2.4.1: Print "Manager Details"
//             4.2.4.2: Print "Name:", "Age:", "Phone number:", "Address:", "Department:"
//             4.2.4.3: Call the `printSalary()` method for the Manager

// Step 5: End
