package models;

public class Tournament {

  private String name;
  private Club[] clubs;

  public Tournament(String name, Club[] clubs) {
    this.name = name;
    this.clubs = clubs;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Club[] getClubs() {
    return clubs;
  }

  public void setClubs(Club[] clubs) {
    this.clubs = clubs;
  }

  public int getTotalStarterPoints() {

    int total = 0;
    for (Club club : clubs) {

      for (Athlete athlete : club.getAthletes()) {
        if (athlete.isStarter()) {
          total += athlete.getPoints();
        }
      }

    }
    return total;

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

}
