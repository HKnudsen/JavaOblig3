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
		return this.nesteLedige;
	}
	
	public Innlegg[] getSamling() {
		return this.tabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < this.tabell.length; i++) {
            if (innlegg.getId() == this.tabell[i].getId()) {
                return i;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (Innlegg c : this.tabell) {
            if (c.getId() == innlegg.getId()) {
                return true;
            }
        }
        return false;
	}

	public boolean ledigPlass() {
		for (Object c : this.tabell) {
            if (c == null) {
                return true;
            }
        }
        return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        if (ledigPlass() && !finnes(innlegg)) {
            this.tabell[nesteLedige] = innlegg;
            return true;
        }
        return false;
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