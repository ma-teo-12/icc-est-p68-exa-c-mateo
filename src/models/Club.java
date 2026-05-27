package models;

public class Club {

  private String name;
  private Athlete[] athletes;

  
  public Club(String name, Athlete[] athletes) {
    this.name = name;
    this.athletes = athletes;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Athlete[] getAthletes() {
    return athletes;
  }
  public void setAthletes(Athlete[] athletes) {
    this.athletes = athletes;
  }
  @Override
  protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
  }
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return super.equals(obj);
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
  }

  

  
  
}
