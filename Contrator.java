public class Contractor{
    private int contractorSalary;

    public void  setContractorSalary(int contractorSalary ){
        this.contractorSalary=contractorSalary;
    }

    public int calculateContractorSalary(int hoursWorked){
        return contractorSalary * hoursWorked;
    }
}