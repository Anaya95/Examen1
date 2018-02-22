package com.cenfotec.procesador;

public class ProcesadorRomano {
	
	private String numRomano;
	
	public ProcesadorRomano() {
		numRomano = "I";
	}
	
	public ProcesadorRomano(String pnumRomano) {
		numRomano = pnumRomano;
	}
	
	public String getNumRomano(){
		return this.numRomano;
	}
	
	public int procesar(String pnumRomano){
		
		String [][] valoresLetras = {{"I","1"},{"II","2"},{"III","3"},{"V","5"},{"X","10"},
				 					{"L","50"},{"C","100"},{"D","500"},{"M","1000"}};
		 
		String [] numDescompuesto = pnumRomano.split("");
		int numRetorno = 0;
		
		for(int i=0; i<numDescompuesto.length; i++) {
			
			numRetorno = numRetorno + Integer.parseInt(numDescompuesto[i]);
        }
		
		switch(pnumRomano){
			case "": 
				numRetorno = 0;
			case "I": 
				numRetorno = 1;
			case "II": 
				numRetorno = 2; 
			case "III": 
				numRetorno = 3;  
			case "IIII": 
				numRetorno = -1;  
			case "V": 
				numRetorno = 5; 
			case "X": 
				numRetorno = 10;
			case "L": 
				numRetorno = 50; 
			case "C": 
				numRetorno = 100; 
			case "D": 
				numRetorno = 500;
	    }   
		
		return numRetorno;
	}
}
