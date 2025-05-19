package estruturadadosvetor.Exerc;

import estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exerc05 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("c");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.limpar();
		System.out.println();
		
		System.out.println(lista);
	}

}
