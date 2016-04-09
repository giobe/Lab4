package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Parola;
import it.polito.tdp.anagrammi.model.Principale;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {

	Principale model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnCerca;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doCerca(ActionEvent event) {
    	
    	String parola = txtParola.getText();
    	Parola p = new Parola(parola);
    	List<String> anagrammi = (List<String>) model.listaAnagrammi(p);
    	for(String s : anagrammi){
    		if(model.controlloEsiste(s)==true){
    			//metto che abbia colore rosso e la metto nel txtresult
    		}
    		else if(model.controlloEsiste(s)!=true){
    			//metto che abbia clore nero e la metto nel txt result
    		}
    			
    	}
    	//chiuso il for inserisco tutto nel txtresult forse??

    }

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	txtParola.clear();

    }
    public void setModel(Principale model){
    	this.model=model;
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
}
