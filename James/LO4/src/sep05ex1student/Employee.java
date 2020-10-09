package sep05ex1student;


/**
 * This class models an employee.
 */
public class Employee
{
    // The name of the employee.
    private String name;
    private String lastName;
    
    // Whether the employee is a trainee or not.
    private boolean trainee;
    //Alder p� Employee
    private int age;
    

    /**
     * Creates an employee as a trainee with the given name.
     */
    public Employee(String name, String lastName, int age)
    {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.trainee = true;
    }

    /**
     * Sets the name of the employee.
     */
    public void setName(String name)
    {
        this.name = name;
        
    }

    /**
     * Returns the name of the employee.
     */
    public String getName()
    {
        return name;
    }
    
    public void lastName(String lastName)
    {
        this.lastName = lastName;
        
    }

  
    // Returns the name of the employee.
    
    public String lastName()
    {
        return lastName;
    }
  
    public void setAge(int age) {
    	this.age = age;
    }
    
    public int getAge() {
    	return age;
    }

    /**
     * Sets the trainee state of the employee.
     */
    public void setTrainee(boolean trainee)
    {
        this.trainee = trainee;
    }

    /**
     * Returns the trainee state of the employee.
     */
    public boolean isTrainee()
    {
        return trainee;
    }

    /**
     * Returns a description of the employee (for test purposes).
     */
    
    public String toString()
    {
        return name + " (trainee: " + trainee + ")";
    }
    
    public int birthsday() {
    	
    	return age + 1;
    }

    /**
     * Prints a description of the employee.
     */
    public void printEmployee()
    {
    	System.out.println("******************************************************");
        System.out.println("First Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Trainee: " + trainee);
        System.out.println("Age : " + age + " years old");
        System.out.println("Congratulation its your birthday today : " + birthsday() + " years");
        System.out.println("******************************************************");
        System.out.println();
    }
}
