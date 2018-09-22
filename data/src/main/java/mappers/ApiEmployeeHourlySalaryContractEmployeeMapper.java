package mappers;

import model.APIEmployee;
import model.HourlySalaryContractEmployee;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Scope
@Component
public class ApiEmployeeHourlySalaryContractEmployeeMapper implements Function<APIEmployee, HourlySalaryContractEmployee> {

    @Override
    public HourlySalaryContractEmployee apply(APIEmployee apiEmployee) {
        return new HourlySalaryContractEmployee(
                apiEmployee.id,
                apiEmployee.name,
                apiEmployee.contractTypeName,
                apiEmployee.roleName,
                apiEmployee.roleDescription,
                apiEmployee.hourlySalary);
    }
}
