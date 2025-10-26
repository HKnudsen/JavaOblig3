package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.Tekst;
import no.hvl.dat100.oppgave2.Bilde;

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
            this.nesteLedige++;
            return true;
        }
        return false;
	}
	
	public String toString() {
		String returnStreng = "";
        int count = 1;
        for (Innlegg c : this.tabell) {
            if(c instanceof Tekst) {
                returnStreng += this.getAntall() + "\n" +
                        "TEKST\n" +
                        count + "\n" +
                        c.getBruker() + "\n" +
                        c.getDato() + "\n0\nen tekst \n";
            } else if (c instanceof Bilde) {
                returnStreng += this.getAntall() + "\n" +
                        "BILDE\n" +
                        count + "\n" +
                        c.getBruker() + "\n" +
                        c.getDato() + "\n0\nnet bilde\n";
            }
        }
        return returnStreng;
    }

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
        Innlegg[] nyTabell = new Innlegg[this.tabell.length * 2];
        for (int i = 0; i < this.tabell.length; i++) {
            nyTabell[i] = this.tabell[1];
        }
        this.tabell = nyTabell;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
        if (ledigPlass() && !finnes(innlegg)) {
            this.leggTil(innlegg);
            return true;
        } else if (!ledigPlass() && !finnes(innlegg)){
            this.utvid();
            this.leggTil(innlegg);
            return true;
        } else {
            return false;
        }
	}
	
	public boolean slett(Innlegg innlegg) {
		for (int i = 0; i < this.tabell.length; i++) {
            if (this.tabell[i].getId() == innlegg.getId()) {
                this.tabell[i] = null;
                return true;
            }
        }
        return false;
	}

	public int[] search(String keyword) {
        int count = 0;
		for (Innlegg c : this.tabell) {
            if (c instanceof Tekst) {
                Tekst t = (Tekst) c;
                if(t.getTekst().contains(keyword)){
                    count++;
                }
            }
        }
        int[] idListe = new int[count];
        count = 0;
        for (Innlegg i : this.tabell) {
            if (i instanceof Tekst) {
                Tekst t = (Tekst) i;
                if (t.getTekst().contains(keyword)) {
                    idListe[count] = t.getId();
                }
            }
        }
        return idListe;
	}
}