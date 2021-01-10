package proba.soapws.data;

import javax.jws.WebService;

@WebService
public class EmployeeServiceImpl implements EmployeeService {

    public Employee getEmployeeById (String id){
        System.out.println("I've got request");
        return new Employee("1", "Vasya Pupkin");
    }
}
