class Employee
{
    String name;
    int basic_salary;

    public Employee(int sal,String name) {
        this.basic_salary=sal;
        this.name=name;
    }
    
}
class Manager extends Employee
{
    int bonus;
   

    public Manager(int sal,String name,int bonus) {
        super(sal, name);
        this.bonus=bonus;
    }

    

  public int calculateSalary()
  {
    return basic_salary+bonus;
  
  }
    
    public static void main(String[] args) {

        Manager m=new Manager(20000,"shruthi",2500);

        
        System.out.println("Managersalary is "+ m.calculateSalary());
    }

}