package model;

public abstract class Employee {
    protected int id;
    protected String name;
    protected String contractType;
    protected String roleDescription;
    protected String role;

    protected abstract Double calculateSalary(double price);

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContractType() {
        return contractType;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public String getRole() {
        return role;
    }
}
