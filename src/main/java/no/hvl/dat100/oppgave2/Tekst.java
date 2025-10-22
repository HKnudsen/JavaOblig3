package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	private String tekst;
	
	public Tekst () {

	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.tekst = tekst;
        this.likes = 0;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.tekst = tekst;
        this.likes = likes;
	}
	
	public String getTekst() {
		throw new UnsupportedOperationException(TODO.method());

	}

	public void setTekst(String tekst) {
		throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		return "TEKST\n" + this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.tekst + "\n";

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
