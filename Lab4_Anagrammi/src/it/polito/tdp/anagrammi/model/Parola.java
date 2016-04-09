package it.polito.tdp.anagrammi.model;

public class Parola {
	String parola;

	public Parola(String parola) {
		this.parola = parola;
	}
	public char getCharAt(int indice){
		return parola.charAt(indice);
	}
	public String scambiaLettere(int i, int j){
		String parolaa ="";
		if(i!=j){
		for(int k=0;k<parola.length();k++){
			
			if(k==i){
				parolaa=parolaa+parola.charAt(j);
			}
			if(k==j){
				parolaa=parolaa+parola.charAt(i);
			}
			else if(k!=i && k!=j)
				parolaa=parolaa+parola.charAt(k);
					
		}
		}
		System.out.println(parolaa);
		return parolaa;
	}
	
	public int size(){
		return parola.length();
	}

}
