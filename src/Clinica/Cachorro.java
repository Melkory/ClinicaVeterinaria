package Clinica;

public class Cachorro extends Animal {

	private static final long serialVersionUID = 1L;
	
	private String genero;
	
	public Cachorro(String nome, int idade, String dono, String cor) {
		super(nome, idade, dono, cor);
		this.especie = "Cachorro";
		this.genero = "Canis";
	}

	@Override
	public String alimentacao() {
		return "Ração";
	}

	@Override
	public String cuidadosProprios() {
		return "Tosa e banho";
	}

	@Override
	public String locomocao() {
		return "Andando/Correndo";
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		String retorno = super.toString();
		retorno += "Genero: " + this.genero + "\n";
		return retorno;
	}
	
	

}
