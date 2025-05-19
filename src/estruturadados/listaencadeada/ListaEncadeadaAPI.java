package estruturadados.listaencadeada;

import java.util.LinkedList;

public class ListaEncadeadaAPI {

    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        lista.add("A");             // add(e): adiciona no final da lista
        lista.addFirst("Início");   // addFirst(e): adiciona no começo da lista
        lista.addLast("Fim");       // addLast(e): adiciona no final da lista (igual add)

        System.out.println(lista);  // imprime a lista: [Início, A, Fim]

        System.out.println(lista.getFirst());   // getFirst(): retorna o primeiro elemento (sem remover)
        System.out.println(lista.getLast());    // getLast(): retorna o último elemento (sem remover)

        System.out.println(lista.peek());       // peek(): retorna o primeiro elemento, retorna null se vazia (sem erro)
        System.out.println(lista.peekFirst());  // peekFirst(): igual peek(), retorna primeiro
        System.out.println(lista.peekLast());   // peekLast(): retorna último elemento (sem remover)

        System.out.println(lista.remove());     // remove(): remove e retorna o primeiro elemento
        System.out.println(lista.removeFirst()); // removeFirst(): remove e retorna o primeiro elemento
        System.out.println(lista.removeLast());  // removeLast(): remove e retorna o último elemento

        System.out.println(lista.size());       // size(): retorna o tamanho da lista
        System.out.println(lista.isEmpty());    // isEmpty(): verifica se a lista está vazi 
    }
}