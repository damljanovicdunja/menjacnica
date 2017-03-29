package specifikacijainterfejsa;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface KursMetode {

	public void dodajKurs(GregorianCalendar datum,String naziv, String skraceni, double prodajni,double srednji, double kupovni);
	public void obrisiKurs(GregorianCalendar datum,String naziv);
	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv);
}
