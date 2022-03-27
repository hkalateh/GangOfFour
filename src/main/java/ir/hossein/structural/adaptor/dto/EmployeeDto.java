package ir.hossein.structural.adaptor.dto;

public class EmployeeDto {
  private Long id;
  private String firstName;
  private String lastName;
  private String studentId;
  private String grade;

  public EmployeeDto(Long id, String firstName, String lastName, String studentId, String grade) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentId = studentId;
    this.grade = grade;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }
}
