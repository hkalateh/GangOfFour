package ir.hossein.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatementTest {

  @Test
  public void test(){
    Statement statement = Statement.StatementBuilder.getStatementBuilder("select name,family","emp")
        .withWhere("salary >= 1000").withRecord(new Record()).build();
//    System.out.println(statement.hashCode());
//    System.out.println(statement.getRecord().hashCode());
    System.out.println(statement);


    Statement clone = statement.clone();
//    System.out.println(clone.hashCode());
    assertNotEquals(statement.hashCode(),clone.hashCode());
    //test for shadow copy
    assertEquals(statement.getRecord().hashCode(),clone.getRecord().hashCode());
//    System.out.println(clone.getRecord().hashCode());
  }

}