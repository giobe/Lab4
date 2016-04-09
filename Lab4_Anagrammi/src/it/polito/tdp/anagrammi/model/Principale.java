package it.polito.tdp.anagrammi.model;

import java.util.Collection;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.anagrammi.db.ParolaDAO;



public class Principale {
	
	public Collection<String> listaAnagrammi(Parola parola){
		int passo=0;
		return cerca(parola,passo);
	}

	public Collection<String> cerca(Parola parola, int passo){
		LinkedList<String> parole = new LinkedList<String>();
		
		if(passo==parola.size()){
			return parole;
		}
		for(int i=parola.size()-1;i>=0;i--){
			System.out.println("entro nel for");
			String a =parola.scambiaLettere(passo,i);
			System.out.println("fsccio scambio lettera");
			if(parole.contains(a)!=true){
				parole.add(a);
				//cerca(parola,passo).add(a);
				System.out.println(parole);
			}
		}
		cerca(parola,passo+1);
		return parole;
	}
	
	public boolean controlloEsiste(String parola){
		ParolaDAO dao = new ParolaDAO();
		return dao.cerca(parola);
	}
	
	public static void main(String args[]){
		
		Principale p = new Principale();
		List<String> words = (List<String>) p.listaAnagrammi(new Parola("cane"));
		for(String s : words){
			System.out.println(s);
		}
	}
	
}
