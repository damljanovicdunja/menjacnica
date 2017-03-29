package valuta;

import java.util.GregorianCalendar;

import specifikacijainterfejsa.KursMetode;

public class Menjacnica implements KursMetode {

	@Override
	public void dodajKurs(GregorianCalendar datum, String naziv, String skraceni, double prodajni, double srednji,
			double kupovni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obrisiKurs(GregorianCalendar datum, String naziv) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) {
		// TODO Auto-generated method stub
		return null;
	}

}
