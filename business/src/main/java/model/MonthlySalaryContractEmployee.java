package model;

public class MonthlySalaryContractEmployee extends Employee {

    private double salary;

    public MonthlySalaryContractEmployee(int id,
                                         String name,
                                         String contractType,
                                         String roleDescription,
                                         String role,
                                         double monthlySalary) {
        this.id = id;
        this.name = name;
        this.contractType = contractType;
        this.role = role;
        this.roleDescription = roleDescription;
        this.salary = calculateSalary(monthlySalary);
    }

    @Override
    protected Double calculateSalary(double price) {
        return price * 12;
    }

    public double getSalary() {
        return salary;
    }
}
