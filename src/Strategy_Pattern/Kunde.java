package Strategy_Pattern;

import java.util.List;

public class Kunde {
  private String name;

  public Kunde(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public double berechnePreis(List<Tennisstunde> l) {
    double preis = 0;
    for(Tennisstunde ts:l) {
      preis += ts.getPreis();
    }
    return preis;
  }
  
  @Override
  public String toString() {
    return this.name;
  }
}
