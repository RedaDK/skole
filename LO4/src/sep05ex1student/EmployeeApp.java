package sep05ex1student;

public class EmployeeApp
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Hans", "Paulsen", 34);
        
        e1.printEmployee();

        Employee e2 = new Employee("James", "Brown", 23);
        e2.birthsday();
        e2.setTrainee(false);
        e2.printEmployee();
      
    }

}
