package mappers;

import model.DataEmployee;
import model.MonthlySalaryContractEmployee;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Scope
@Component
public class DataEmployeeMonthlySalaryContractEmployeeMapper implements Function<DataEmployee, MonthlySalaryContractEmployee> {

    @Override
    public MonthlySalaryContractEmployee apply(DataEmployee dataEmployee) {
        return new MonthlySalaryContractEmployee(
                dataEmployee.getId(),
                dataEmployee.getName(),
                dataEmployee.getContractTypeName(),
                dataEmployee.getRoleName(),
                dataEmployee.getRoleName(),
                dataEmployee.getMonthlySalary());
    }
}
