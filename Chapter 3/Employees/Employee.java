public class Employee {
  private String Name;
  private double salary;
  
  public Employee(String fullName, double inputSalary){
    this.Name = fullName;
    this.salary = inputSalary;
}

public String getName(){
    return Name;
}
  
public double getSalary(){
    return salary;
    
}

public String raiseSalary(double byPercent){
  salary += (salary*byPercent/100);
   return Name + " new salary with the raise is $" + salary;  
}

}


