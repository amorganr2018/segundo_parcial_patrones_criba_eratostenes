package CribaEratostenes;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	static Scanner in = new Scanner(System.in);
	static PrintStream out = System.out;

	public static void main(String[] args) {
		
		int tope = 0;
		
		ArrayList<Integer> lista;
		
		out.print("Digite el numero tope: ");
		
		tope = in.nextInt();
		
		lista = CribaEratostenes.generaCriba(tope);
		
		if(lista != null) {
			out.println("Lista de numeros primos: "+ lista.toString());
		}else {
			out.println("El numero no valido");
		}		
		
	}

}
