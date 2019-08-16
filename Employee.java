public class Employee extends Person{
  private int employeeSalary;
  private boolean hasBenefit=true;

 public void setEmployeeSalary(int employeeSalary){
      this.employeeSalary=employeeSalary;
 }

 public int calculateEmployeeSalary(){
     return employeeSalary * 40;
 }

 public boolean DoesEmployeeHaveBenefits(){
     return hasBenefit;
 }
}