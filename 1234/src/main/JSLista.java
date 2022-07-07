package main;

import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;

public class JSLista extends AJSLista {
	
	public void izbaciCvor(CvorJSListe cvor) {
		if (null == prvi) {
			return;
		}

		if (prvi == cvor) {
			prvi = prvi.sledeci;
			return;
		}

		CvorJSListe brzi = prvi;
		CvorJSListe spori = prvi;
		while (brzi.sledeci != null) {
			if (brzi == cvor) {
				spori.sledeci = brzi.sledeci;
				return;
			}
			spori = brzi;
			brzi = brzi.sledeci;
		}

		if (brzi == cvor) {
			spori.sledeci = brzi.sledeci;
		}
	}
	
	@Override
	public void metoda2(int podatak) throws LabisException{
		CvorJSListe tekuci = prvi;
		while(tekuci != null) {
			if(tekuci.podatak < podatak)
				izbaciCvor(tekuci);
			tekuci = tekuci.sledeci;
		}
	}
}
