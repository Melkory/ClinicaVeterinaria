package Clinica;

public class Passaro extends Animal {

	private static final long serialVersionUID = 1L;
	
	private String genero;
	
	public Passaro(String nome, int idade, String dono, String cor) {
		super(nome, idade, dono, cor);
		this.especie = "Pássaro";
		this.setGenero("Ornithurae");
	}

	@Override
	public String alimentacao() {
		return "Alpiste";
	}

	@Override
	public String cuidadosProprios() {
		return "Abrigo e estímulos";
	}

	@Override
	public String locomocao() {
		return "Voando";
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
