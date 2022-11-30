package Strategy_Pattern;

import java.util.List;

public class Standardabrechnung implements Abrechnung {

	@Override
	public double berechnePreis(List<Tennisstunde> l) {
		double preis = 0;
		for(Tennisstunde ts:l) {
			preis += ts.getPreis();
		}
		return preis;
	}

}
