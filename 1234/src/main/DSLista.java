package main;
import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;

public class DSLista extends ADSLista {

	@Override
	public int metoda1() throws LabisException {
		if(prvi == null)
			throw new LabisException();
		CvorDSListe tekuci = prvi;
		int brojac = 1;
		int brojElemenata = 0;
		while(tekuci != null) {
			if(brojac % 2 == 1 && tekuci.podatak > 0)
				brojElemenata++;
			brojac++;
			tekuci = tekuci.sledeci;
		}
		return brojElemenata;
	}
}
