package mappers;

import model.DataEmployee;
import model.HourlySalaryContractEmployee;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Scope
@Component
public class DataEmployeeHourlySalaryContractEmployeeMapper implements Function<DataEmployee, HourlySalaryContractEmployee> {

    @Override
    public HourlySalaryContractEmployee apply(DataEmployee dataEmployee) {
        return new HourlySalaryContractEmployee(
                dataEmployee.id,
                dataEmployee.name,
                dataEmployee.contractTypeName,
                dataEmployee.roleDescription,
                dataEmployee.roleName,
                dataEmployee.hourlySalary);
    }
}
