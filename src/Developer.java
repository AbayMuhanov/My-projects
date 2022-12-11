public class Developer {
  private String langName;

  public String getLangName() {
    return langName;
  }

  public void setLangName(String langName) {
    this.langName = langName;
  }

  public void writeCode() {
    System.out.println("Default lang syntax");
  }

  public void reaction() {
    System.out.println("Default reaction");
  }
}
