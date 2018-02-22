package com.cenfotec.procesador;

public class ProcesadorRomano {
	
	private static String [][] valsLetrasRomanas = {{"I","1"},{"V","5"},{"X","10"},{"L","50"},{"C","100"},{"D","500"},{"M","1000"}};
	
	public String [][] getValoresLetras(){
		return valsLetrasRomanas;
	}
	
	public int procesar(String pnumRomano){
		
		int romanoANum = 0;
		String [] numDescompuesto = pnumRomano.split("");
		
		if(pnumRomano == "") {
			romanoANum = 0;
		} else {
			if(pnumRomano.equals("IIII") || verifCantLetras(numDescompuesto) == true) {
				romanoANum = -1;
			} else {			
				for(int i=0; i<numDescompuesto.length; i++) {
					for(int h=0; h<valsLetrasRomanas.length; h++) {
						if(numDescompuesto[i].equals(valsLetrasRomanas[h][0])) {
							romanoANum = romanoANum + Integer.parseInt(valsLetrasRomanas[h][1]);
						}
		        	}
				}
			}
		}
		
		return romanoANum;
	}
	
	public boolean verifCantLetras(String [] pnumDescompuesto) {
		
		boolean error = false;
		int contI = 0;
		int contL = 0;
		int contD = 0;
		int contX = 0;
		int contC = 0;
		
		for(int i=0; i<pnumDescompuesto.length; i++) {
			
			switch(pnumDescompuesto[i]){
			
			case "I":
				contI++;
				break;
				
			case "L":
				contL++;
				break; 
			
			case "D":
				contD++;
				break; 
			case "X":
				contX++;
				break;
				
			case "C":
				contC++;
				break;
			}
		}
		
		if(contI>3 || contL>1 || contD>1 || contX>3 || contC>3) {
			error = true;
		}
		
		return error;
	}

	/*public boolean verifOrdenDesc(String [] pnumDescompuesto){
		
		boolean error = false;
		int[]romanosANum = new int[pnumDescompuesto.length];
		
		for(int i=0; i<pnumDescompuesto.length; i++) {
			for(int h=0; h<valsLetrasRomanas.length; h++) {
				if(pnumDescompuesto[i].equals(valsLetrasRomanas[h][0])) {
					romanosANum[i] = Integer.parseInt(valsLetrasRomanas[h][1]);
				}
        	}
		}
		
	}*/
}
