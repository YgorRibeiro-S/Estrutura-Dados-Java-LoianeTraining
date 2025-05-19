package estruturadados.pilha.Exerc;

import java.util.Stack;
import java.util.Scanner;
import java.util.EmptyStackException;

public class Exerc01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int[] numeros = new int[10];
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " é par. Empilhando...");
                stack.push(numeros[i]);
            } else {
                System.out.println(numeros[i] + " é ímpar. Tentando desempilhar...");

                try {
                    int desempilhado = stack.pop();
                    System.out.println("Valor desempilhado: " + desempilhado);
                } catch (EmptyStackException e) {
                    System.out.println("Erro: A pilha está vazia!");
                }
            }
        }

        System.out.println("\nValores restantes na pilha:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
