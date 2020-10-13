public class Main {
  public static void main(String[] args)
  {
    Employee harry = new Employee("Harry Hacker", 50000);
    
    System.out.println("Expected results Harry Hacker, salary: 50000, new salary with raise: 57000");
    
    System.out.print("The Employee's Full name is " + harry.getName() + " and their salary is $" + harry.getSalary() + ". " + harry.raiseSalary(15));

  }
}