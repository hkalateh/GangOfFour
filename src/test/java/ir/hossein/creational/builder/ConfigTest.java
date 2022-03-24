package ir.hossein.creational.builder;

import org.junit.jupiter.api.Test;

class ConfigTest {

  @Test
  public void testBuilder() {
    Config conf = Config.ConfigBuilder.aConfig().addName("design pattern")
        .addLength("5").addLocate("creational").build();

    System.out.println(conf.getName() + " " + conf.getLength() + " " + conf.getLocate());
  }

}