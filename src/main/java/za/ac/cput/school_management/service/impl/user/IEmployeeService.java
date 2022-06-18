/**
 * IEmployeeService.java
 * Service implementation for Employee
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 June 2022
 */
package za.ac.cput.school_management.service.impl.user;

import za.ac.cput.school_management.domain.user.Employee;
import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface IEmployeeService extends IService<Employee, String> {
    List<Employee> getAll();
}
