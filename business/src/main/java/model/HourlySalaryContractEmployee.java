package model;

public class HourlySalaryContractEmployee extends Employee {

    private double salary;

    public HourlySalaryContractEmployee(int id,
                                        String name,
                                        String contractType,
                                        String roleDescription,
                                        String role,
                                        double hourlySalary) {
        this.id = id;
        this.name = name;
        this.contractType = contractType;
        this.role = role;
        this.roleDescription = roleDescription;
        this.salary = calculateSalary(hourlySalary);
    }

    @Override
    protected Double calculateSalary(double price) {
        return 120 * price * 12;
    }

    public double getSalary() {
        return salary;
    }
}
