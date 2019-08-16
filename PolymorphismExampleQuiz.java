
public class PolymorphismExampleQuiz{
    public static void main(String[] args) {
        Person employee= new Employee();
        employee.setPersonName("John");
        employee.setPersonBirthday(1205);
        employee.setEmployeeSalary(700);
        System.out.println("employee salary "+ employee.calculateEmployeeSalary());
        System.out.println("does employee have benefits " +employee.DoesEmployeeHaveBenefits);

        Person  contractor = new Contractor();
        contractor.setPersonName("John");
    }
}