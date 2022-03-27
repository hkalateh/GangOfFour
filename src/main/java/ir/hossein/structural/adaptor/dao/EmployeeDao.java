package ir.hossein.structural.adaptor.dao;

import ir.hossein.structural.adaptor.Employee;

public class EmployeeDao {

  public Long save(Employee employee) {
    return employee.getId();
  }

  public void delete(Long id) {
    System.out.println("student with id:" + id + " deleted");
  }
}
