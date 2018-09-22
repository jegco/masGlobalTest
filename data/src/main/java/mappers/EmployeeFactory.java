package mappers;

import model.DataEmployee;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope
@Component
public class EmployeeFactory {

    @Autowired
    private DataEmployeeHourlySalaryContractEmployeeMapper dataEmployeeHourlySalaryContractEmployeeMapper;

    @Autowired
    private DataEmployeeMonthlySalaryContractEmployeeMapper dataEmployeeMonthlySalaryContractEmployeeMapper;

    public Employee getEmployee(DataEmployee dataEmployee) {
        switch (dataEmployee.contractTypeName) {
            case "${datalayer.hoyrly-employee}":
                return dataEmployeeHourlySalaryContractEmployeeMapper.
                        apply(dataEmployee);
            default:
                return dataEmployeeMonthlySalaryContractEmployeeMapper.
                        apply(dataEmployee);
        }
    }
}
