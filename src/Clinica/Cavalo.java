package Clinica;

public class Cavalo extends Animal {

	private static final long serialVersionUID = 1L;
	
	private String genero;
	
	public Cavalo(String nome, int idade, String dono, String cor) {
		super(nome, idade, dono, cor);
		this.especie = "Cavalo";
		this.genero = "Equus";
	}

	@Override
	public String alimentacao() {
		return "Alfafa";
	}

	@Override
	public String cuidadosProprios() {
		return "Tosa, limpar os cascos e correr";
	}

	@Override
	public String locomocao() {
		return "Trotando e Correndo";
	}
	
	@Override
	public String toString() {
		String retorno = super.toString();
		retorno += "Genero: " + this.genero + "\n";
		return retorno;
	}
	
}
