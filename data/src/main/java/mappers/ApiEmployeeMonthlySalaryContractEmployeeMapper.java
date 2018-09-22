package mappers;

import model.APIEmployee;
import model.HourlySalaryContractEmployee;
import model.MonthlySalaryContractEmployee;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Scope
@Component
public class ApiEmployeeMonthlySalaryContractEmployeeMapper implements Function<APIEmployee, MonthlySalaryContractEmployee> {

    @Override
    public MonthlySalaryContractEmployee apply(APIEmployee apiEmployee) {
        return new MonthlySalaryContractEmployee(
                apiEmployee.id,
                apiEmployee.name,
                apiEmployee.contractTypeName,
                apiEmployee.roleName,
                apiEmployee.roleDescription,
                apiEmployee.monthlySalary);
    }
}
