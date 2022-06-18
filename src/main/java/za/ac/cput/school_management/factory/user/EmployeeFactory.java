/**
 * NameFactory.java
 * Factory class for Name class
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 June 2022
 */
package za.ac.cput.school_management.factory.user;
import za.ac.cput.school_management.domain.user.Employee;
import za.ac.cput.school_management.domain.user.Name;
import za.ac.cput.school_management.util.helper;

public class EmployeeFactory {
    public static Employee build( String staffId, String email, Name name){

        if(email.equals("")){
            throw new IllegalArgumentException("Email is empty.");
        }
        else if(!helper.emailIsValid(email)){
            throw new IllegalArgumentException("Email is not valid");
        }




        //String staffId = helper.generateUUID();
        return new Employee.Builder()
                .setStaffId(staffId)
                .setEmail(email)
                .setName(name)
                .build();
    }
}
