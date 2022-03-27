package ir.hossein.creational.prototype;

public class Statement implements Cloneable {

  private String projection;
  private String from;
  private String where;
  private String groupBy;
  private String having;
  private String orderBy;
  private Record rec;

  private Statement() {
  }

  public Statement(StatementBuilder statementBuilder) {
    this.projection = statementBuilder.projection;
    this.from = statementBuilder.from;
    this.where = statementBuilder.where;
    this.groupBy = statementBuilder.groupBy;
    this.having = statementBuilder.having;
    this.orderBy = statementBuilder.orderBy;
    this.rec = statementBuilder.record;
  }


  //prototype ==> implements Cloneable and Override clone method
  // for deep copy we must assign everything or use serialization
  // by default prototype done shadow copy
  @Override
  public Statement clone() {
    Statement statement = null;
    try {
      statement = (Statement) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return statement;
  }


  @Override
  public String toString() {
    return "Statement{" +
        "projection='" + projection + '\'' +
        ", from='" + from + '\'' +
        ", where='" + where + '\'' +
        ", groupBy='" + groupBy + '\'' +
        ", having='" + having + '\'' +
        ", orderBy='" + orderBy + '\'' +
        '}';
  }

  public String getProjection() {
    return projection;
  }

  public String getFrom() {
    return from;
  }

  public String getWhere() {
    return where;
  }

  public String getGroupBy() {
    return groupBy;
  }

  public String getHaving() {
    return having;
  }

  public String getOrderBy() {
    return orderBy;
  }

  public Record getRecord() {
    return rec;
  }

  public static final class StatementBuilder {
    private String projection;
    private String from;
    private String where;
    private String groupBy;
    private String having;
    private String orderBy;
    private Record record;

    private StatementBuilder(String projection, String from) {
      this.projection = projection;
      this.from = from;
    }

    public static StatementBuilder getStatementBuilder(String projection, String from) {
      return new StatementBuilder(projection, from);
    }

    public StatementBuilder withWhere(String where) {
      this.where = where;
      return this;
    }

    public StatementBuilder withGroupBy(String groupBy) {
      this.groupBy = groupBy;
      return this;
    }

    public StatementBuilder withHaving(String having) {
      this.having = having;
      return this;
    }

    public StatementBuilder withOrderBy(String orderBy) {
      this.orderBy = orderBy;
      return this;
    }

    public StatementBuilder withRecord(Record record) {
      this.record = record;
      return this;
    }

    public Statement build() {
      Statement statement = new Statement();
      statement.projection = projection;
      statement.from = from;
      statement.where = where;
      statement.groupBy = groupBy;
      statement.having = having;
      statement.orderBy = orderBy;
      statement.rec = record;
      return statement;
    }
  }
}
