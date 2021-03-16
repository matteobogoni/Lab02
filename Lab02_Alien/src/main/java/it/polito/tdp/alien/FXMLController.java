package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private AlienDictionary model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtTesto;

    @FXML
    private TextArea txtRisultato;

    @FXML
    void doReset(ActionEvent event) {
    	txtTesto.clear();
    	txtRisultato.clear();
    	model.clearAll();
    }

    @FXML
    void doTranslate(ActionEvent event) {
     	
    	String testo = txtTesto.getText().toLowerCase();
    	String campi[] = testo.split(" ");
    	String alienWord;
    	String translate;
    	
    	if(testo.matches(".*[a-z].*") == false) {
    		txtRisultato.setText("ERRORE CARATTERI NON VALIDI");
    		return;
    	}
    	
    	if(campi.length == 2) {
    		alienWord = campi[0];
    		translate = campi[1];
    		Word w = new Word(alienWord, translate);
    		model.addWord(alienWord, translate);
    		txtRisultato.setText(w.toString());
    		txtTesto.setText("");
    	}
    	else if (campi.length == 1) {
    		
    		alienWord = campi[0];
    		
    		txtRisultato.setText(model.translateWord(alienWord));
    	}
    }
    public void setModel(AlienDictionary model) {
    	this.model = model;
    }

    @FXML
    void initialize() {
        assert txtTesto != null : "fx:id=\"txtTesto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
