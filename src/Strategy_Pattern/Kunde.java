package Strategy_Pattern;

import java.util.List;

public class Kunde {
  private String name;
  private Abrechnung abrechnung;

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
    return abrechnung.berechnePreis(l);
  }

  public void setAbrechnung(Abrechnung a){
    this.abrechnung = a;
  }


  @Override
  public String toString() {
    return this.name;
  }
}
