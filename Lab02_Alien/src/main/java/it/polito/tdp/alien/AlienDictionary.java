package it.polito.tdp.alien;

import java.util.HashMap;
import java.util.Map;

public class AlienDictionary {
	
	private Map<String, Word> mappaParole;
	
	public  AlienDictionary() {
		this.mappaParole = new HashMap<>();
	}
	
	public void addWord (String alienWord, String translate) {
		
		Word w = null;
		
		if(mappaParole.get(alienWord) == null) {
			w = new Word(alienWord, translate);
			w.addTraduzioni(translate);
			mappaParole.put(alienWord, w);
		}
		else {
			mappaParole.get(alienWord).addTraduzioni(translate);
		}
	}
	
	public String translateWord(String alienWord) {
		
		Word w = mappaParole.get(alienWord);
		
		if(w == null) {
			return null;
		}
		else {
			String risultato = "";
			for(String s : w.getTraduzioni()) {
				risultato += s +"\n";
			}
			return risultato;
		}
	}
	
	public void clearAll() {
		mappaParole.clear();
	}
	
}
