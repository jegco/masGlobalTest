package mappers;

import model.APIEmployee;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope
@Component
public class EmployeeFactory {

    @Autowired
    private ApiEmployeeHourlySalaryContractEmployeeMapper apiEmployeeHourlySalaryContractEmployeeMapper;

    @Autowired
    private ApiEmployeeMonthlySalaryContractEmployeeMapper apiEmployeeMonthlySalaryContractEmployeeMapper;

    public Employee getEmployee(APIEmployee apiEmployee) {
        switch (apiEmployee.contractTypeName) {
            case "HourlySalaryEmployee":
                return apiEmployeeHourlySalaryContractEmployeeMapper.
                        apply(apiEmployee);
            default:
                return apiEmployeeMonthlySalaryContractEmployeeMapper.
                        apply(apiEmployee);
        }
    }
}
