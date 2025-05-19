package estruturadados.pilha;

import java.util.Stack;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();

		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty()); //EstaVazia
		
		stack.push(1); //Empilha
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size()); //Tamanho
		System.out.println(stack);
		
		System.out.println(stack.peek()); //Topo
		
		System.out.println(stack.pop()); //Desempilha
		
		System.out.println(stack);
	}

}