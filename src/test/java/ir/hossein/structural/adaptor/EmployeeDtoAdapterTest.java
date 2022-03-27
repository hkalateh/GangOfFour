package ir.hossein.structural.adaptor;

import ir.hossein.structural.adaptor.dao.EmployeeDao;
import ir.hossein.structural.adaptor.dto.EmployeeDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDtoAdaptorTest {

  @Test
  void test() {
    EmployeeDto employeeDto = new EmployeeDto(1L,"hossein","kalateh","11111","12");
    EmployeeDao employeeDao = new EmployeeDao();
    assertEquals(1L, employeeDao.save(new EmployeeDtoAdaptor(employeeDto)));
  }
}