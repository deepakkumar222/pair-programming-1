package org.tg.ppad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tg.ppad.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e.firstName,e.lastName,e.age,e.emailId from Employee e" )
    List<Object[]> getEmployeeData();

    @Query(value = "select concat(firstName,' ',lastName) from employees where id=:employeeId" ,nativeQuery = true)
    List<Object[]> getEmployeeFullName( @Param("employeeId") Long employeeId);


}