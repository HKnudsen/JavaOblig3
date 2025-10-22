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
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.url = url;
        this.likes = likes;
	}
	
	public String getUrl() {
		throw new UnsupportedOperationException(TODO.method());

	}

	public void setUrl(String url) {
		throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		return "BILDE\n" + this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + "0\n" + "et bilde\n" +
                this.url + "oo.jpg\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
