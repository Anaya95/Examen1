package com.cenfotec.procesador;

public class ProcesadorRomano {
	
	private static String [][] valsLetrasRomanas = {{"I","1"},{"V","5"},{"X","10"},{"L","50"},{"C","100"},{"D","500"},{"M","1000"}};
	
	public String [][] getValoresLetras(){
		return valsLetrasRomanas;
	}
	
	public int procesar(String pnumRomano){
		
		int romanoANum = 0;
		
		if(pnumRomano == "") {
			romanoANum = 0;
		} else {
			String [] numDescompuesto = pnumRomano.split("");
			
			System.out.println(numDescompuesto.length);
			
			for(int i=0; i<numDescompuesto.length; i++) {
				for(int h=0; h<valsLetrasRomanas.length; h++) {
					if(numDescompuesto[i] == valsLetrasRomanas[h][0]) {
						romanoANum = romanoANum + Integer.parseInt(valsLetrasRomanas[h][1]);
					}
		        }
	        }
		}
		
		return romanoANum;
	}
}
