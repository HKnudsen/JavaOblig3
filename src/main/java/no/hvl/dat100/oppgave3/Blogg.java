package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] tabell;
    private int nesteLedige;

	public Blogg() {
		this.tabell = new Innlegg[20];
        this.nesteLedige = 0;
	}

	public Blogg(int lengde) {
		this.tabell = new Innlegg[lengde];
        this.nesteLedige = 0;
	}

	public int getAntall() {
		int count = 0;
        for(Object t: this.tabell) {
            if (t != null) {
                count ++;
            }
        }
        return count;
	}
	
	public Innlegg[] getSamling() {
		int lengde = this.getAntall();
        Innlegg[] liste = new Innlegg[lengde];
        for (int i = 0; i < lengde; i++) {
            liste[i] = this.tabell[i];
        }
        return liste;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}