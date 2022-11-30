package Strategy_Pattern;

import java.util.List;

public interface Abrechnung {
	public double berechnePreis(List<Tennisstunde>tennisliste);
}
