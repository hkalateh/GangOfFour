package ir.hossein.structural.adaptor;

import ir.hossein.structural.adaptor.dto.EmployeeDto;

public class EmployeeDtoAdapter extends Employee {
  private final EmployeeDto employeeDto;

  public EmployeeDtoAdapter(EmployeeDto employeeDto) {
    this.employeeDto = employeeDto;
  }

  @Override
  public Long getId() {
    return employeeDto.getId();
  }

  @Override
  public String getFullName() {
    return employeeDto.getFirstName() + " " + employeeDto.getLastName();
  }

  @Override
  public String getCode() {
    return employeeDto.getStudentId();
  }

  @Override
  public Integer getGrade() {
    return Integer.parseInt(employeeDto.getGrade());
  }
}
