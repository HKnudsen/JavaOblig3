package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.url = url;
        this.likes = 0;
        this.tekst = tekst
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.url = url;
        this.likes = likes;
        this.tekst = tekst;
	}
	
	public String getUrl() {
		return this.url;

	}

	public void setUrl(String url) {
        this.url = url;
	}

	@Override
	public String toString() {
		return "BILDE\n" + this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + "0\n" + "et bilde\n" +
                this.url + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
