package ir.hossein.creational.builder;

public class Config {
  private String locate;
  private String name;
  private String length;


  private Config() {
  }

  public String getLocate() {
    return locate;
  }

  /*public void setLocate(String locate) {
    this.locate = locate;
  }*/

  public String getName() {
    return name;
  }

  /*public void setName(String name) {
    this.name = name;
  }*/

  public String getLength() {
    return length;
  }

  /*public void setLength(String length) {
    this.length = length;
  }*/

  public static final class ConfigBuilder {
    private String locate;
    private String name;
    private String length;

    private ConfigBuilder() {
    }

    public static ConfigBuilder aConfig() {
      return new ConfigBuilder();
    }

    public ConfigBuilder addLocate(String locate) {
      this.locate = locate;
      return this;
    }

    public ConfigBuilder addName(String name) {
      this.name = name;
      return this;
    }

    public ConfigBuilder addLength(String length) {
      this.length = length;
      return this;
    }

    public Config build() {
      Config config = new Config();
      config.locate = locate;
      config.name = name;
      config.length = length;
      return config;
    }
  }
}
