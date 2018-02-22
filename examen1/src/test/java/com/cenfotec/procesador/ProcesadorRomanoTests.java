package com.cenfotec.procesador;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProcesadorRomanoTests {
	
	/*@Test
	public void testStringVacio() {
		ProcesadorRomano procRomano = new ProcesadorRomano();
		int romanoEnNum = procRomano.procesar("");
		assertEquals(romanoEnNum,0);
	}*/
	
	@Test
	public void testValoresLetras() {
		
		String [][] valoresPruebas={{"I","1"},{"II","2"},{"III","3"},{"IIII","Error"},
									{"V","5"},{"X","10"},{"L","50"},{"C","100"},
									{"D","500"},{"M","1000"}};
		
		ProcesadorRomano procRomano = new ProcesadorRomano();
		int romanoEnNum;
		
		for(int i=0; i<valoresPruebas.length; i++) {
			
			romanoEnNum = procRomano.procesar(valoresPruebas[i][0]);
			assertEquals(romanoEnNum,Integer.parseInt(valoresPruebas[i][1]));
        }
	}/*
	
	@Test
	public void testValoresPruebas() {
		
		String [][] valoresPruebas = {{"LX","60"},{"XVI","16"},{"VIII","8"},
									 {"XXI","21"},{"CI","101"},{"CLXI","161"}};
		
		int romanoEnNum;
		ProcesadorRomano procRomano = new ProcesadorRomano();
		
		for(int i=0; i<valoresPruebas.length; i++) {
			
			romanoEnNum = procRomano.procesar(valoresPruebas[i][0]);
			assertEquals(romanoEnNum,Integer.parseInt(valoresPruebas[i][1]));
        }
	}
	
	@Test
	public void testCantLetras() {
		
		String [] valoresPruebas = {"IIII","LL","DD","XXXX","CCCC"};
		
		ProcesadorRomano procRomano = new ProcesadorRomano();
		int romanoEnNum;
		
		for(int i=0; i<valoresPruebas.length; i++) {
			
			romanoEnNum = procRomano.procesar(valoresPruebas[i]);
			assertEquals("Error",romanoEnNum);
        }
	}
	
	@Test
	public void testLetrasDesc() {
		
		int romanoEnNum;
		ProcesadorRomano procRomano = new ProcesadorRomano();
		String error = "";
		
		romanoEnNum = procRomano.procesar("XXL");
		assertEquals("Error",error);
	}*/
}
