package estruturadadosvetor.Exerc;

import estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Contato {

    private String nome;
    private String email;
    private String telefone;

    
    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Telefone: " + telefone;
    }

    public static void main(String[] args) {

       
        Lista<Contato> lista = new Lista<Contato>(20);

        for (int i = 1; i <= 30; i++) {
            Contato contato = new Contato("Contato " + i, "email" + i + "@exemplo.com", "1234-5678");
            lista.adiciona(contato);
        }

       
        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(lista.busca(i));
        }
    }
}
