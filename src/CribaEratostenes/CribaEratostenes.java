package CribaEratostenes;

import java.util.ArrayList;
import java.util.List;

public class CribaEratostenes {
	
	static ArrayList<Integer> arreglo, resultado;
	static int longitud;
	
	public static ArrayList<Integer> generaCriba(int pTope){		
		if(pTope > 1 ) {
			
			LlenarArreglo(pTope);			
			longitud = pTope;			
			resultado = new ArrayList<Integer>();
			
			for(int i=0; i < arreglo.size(); i++) {
				
				//System.out.println("Tamano del arreglo: " +arreglo.size()+ ". Evaluando numero: " +arreglo.get(i));				
				if(esPrimo(arreglo.get(i))) {
					resultado.add(arreglo.get(i));
					EliminarMultiplos(arreglo.get(i), pTope);
				}
			}
		}else {		
			resultado = null;
		}		
		return resultado;		
	}

	
	private static void LlenarArreglo(int pTope) {
		
		arreglo = new ArrayList<Integer>();
		
		for(int i=2; i <= pTope; i++) {
			arreglo.add(i);
		}
	}
	
	private static boolean esPrimo(int pNumero) {
		
		for(int i=2; i<pNumero; i++ ) {
			
			if(pNumero%i == 1) {
				
				return true;
			}
		}		
		return true;		
	}
	
	private static void EliminarMultiplos(int pNumeroPrimo, int pTope) {		
		
		int multiplo = 2;
		int resultadoMultiplo = pNumeroPrimo * 2;		
		
		while(resultadoMultiplo <= pTope) {
			
			arreglo.remove(Integer.valueOf(resultadoMultiplo));
			multiplo++;			
			resultadoMultiplo = pNumeroPrimo * multiplo;			
		}
	}
	

}
