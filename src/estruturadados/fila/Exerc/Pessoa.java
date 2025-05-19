package estruturadados.fila.Exerc;

public class Pessoa {
	
	String nome;
	int idade;
	
		protected Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected int getIdade() {
		return idade;
	}
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	

}
