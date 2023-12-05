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
