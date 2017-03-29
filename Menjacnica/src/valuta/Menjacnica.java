package valuta;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacijainterfejsa.KursMetode;

public class Menjacnica implements KursMetode {
	LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();
	@Override
	public void dodajKurs(GregorianCalendar datum, String naziv, String skraceni, double prodajni, double srednji,
			double kupovni) {
		// TODO Auto-generated method stub
		Valuta nova = new Valuta();
		nova.setDatumKursa(datum);
		nova.setNaziv(naziv);
		nova.setSkraceniNaziv(skraceni);
		nova.setKupovniKurs(kupovni);
		nova.setProdajniKurs(prodajni);
		nova.setSrednjiKurs(srednji);
		
		for (int i = 0; i < kursnaLista.size(); i++) {
			Valuta v = kursnaLista.get(i);
			if(v.getDatumKursa() ==datum && v.getNaziv().equals(naziv))
				throw new RuntimeException("Vec postoji kurs za ovaj datum.");
			else kursnaLista.add(v);
			
		}
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
