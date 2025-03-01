package com.uc.employee_payroll_app.repository;




import com.uc.employee_payroll_app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "SELECT * FROM employee_payroll WHERE department = :department", nativeQuery = true)
    List<Employee> findEmployeesByDepartment(@Param("department") String department);
}
