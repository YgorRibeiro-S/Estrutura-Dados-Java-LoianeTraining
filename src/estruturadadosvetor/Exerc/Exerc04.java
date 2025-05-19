package estruturadadosvetor.Exerc;

import estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exerc04 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("c");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		System.out.println();
		
	    System.out.println(lista.obtem(0));
	    System.out.println(lista.obtem(1));
	    System.out.println(lista.obtem(2));
	    System.out.println(lista.obtem(3));
	    System.out.println(lista.obtem(4));
				
		
		
		
	}

}
