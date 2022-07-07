package main;

import labis.exception.LabisException;
import labis.niz.ANiz;

public class Niz extends ANiz {
	
	/*
	@Override
	public int metoda3a() throws LabisException{
		if(niz == null)
			throw new LabisException();
		int brojElemenata = 0;
		for (int i = 0; i < niz.length; i++) {
			int brojac = 0;
			for (int j = i; j < niz.length; j++) {
				if(niz[i]==niz[j])
					brojac++;
			}
			if(brojac == niz[i])
				brojElemenata++;
		}
		return brojElemenata;
	}
	 */
	
	@Override
	public int metoda3b() throws LabisException{
		if(niz == null)
			throw new LabisException();
		int brojElemenata = 0;
		int[] pomocni = new int[100];
		for (int i = 0; i < pomocni.length; i++) {
			pomocni[niz[i]-1]++;
			if(pomocni[niz[i]-1] == niz[i])
				brojElemenata++;
		}
		return brojElemenata;
	}
}
