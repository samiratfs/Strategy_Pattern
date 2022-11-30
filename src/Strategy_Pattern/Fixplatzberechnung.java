package Strategy_Pattern;

import java.util.List;

public class Fixplatzberechnung implements Abrechnung {
	private int fixstunden;
	private double fixpreis;
	
	public Fixplatzberechnung(int fixstunden, double fixpreis) {
		this.fixstunden = fixstunden;
		this.fixpreis = fixpreis;
	}

	@Override
	 public double berechnePreis(List<Tennisstunde> l) {
	    double preis = fixstunden * fixpreis;
	    for(int i = fixstunden; i < l.size(); i++) {
	      preis += l.get(i).getPreis();
	    }
	    return preis;
	  }
	
}
