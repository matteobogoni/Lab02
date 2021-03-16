package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class Word {
	
	private String alienWord;
	private String translate;
	private List<String> traduzioni;
	
	public Word(String alienWord, String translate) {
		super();
		this.alienWord = alienWord;
		this.translate = translate;
		this.traduzioni = new LinkedList<String>();
	}
	
	
	public String getAlienWord() {
		return alienWord;
	}


	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}


	public String getTranslate() {
		return translate;
	}


	public void setTranslate(String translate) {
		this.translate = translate;
	}
	
	public void addTraduzioni(String translate) {
		traduzioni.add(translate);
	}
	
	public List<String> getTraduzioni() {
		return traduzioni;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "La parola aliena: " + this.alienWord +" è tradotta con: " + this.translate;
	}
	
	
}
