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
		nova.setProdajniKurs(prodajni);
		nova.setSrednjiKurs(srednji);
		nova.setKupovniKurs(kupovni);


		if (kursnaLista.contains(nova)) {
			throw new RuntimeException("Kurs za ovaj datum vec postoji");
		}
		kursnaLista.add(nova);

	}

	@Override
	public void obrisiKurs(GregorianCalendar datum, String naziv) {
		// TODO Auto-generated method stub
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).getDatumKursa() == datum && kursnaLista.get(i).getNaziv().equals(naziv)){
				kursnaLista.remove(i);
				break;
			}
		}
	}

	@Override
	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) {
		// TODO Auto-generated method stub
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).getDatumKursa() == datum && kursnaLista.get(i).getNaziv().equals(naziv)){
				return kursnaLista.get(i);
			}else throw new RuntimeException("Ne postoji trazeni kurs");
		}
		
		return null;
	}

}
