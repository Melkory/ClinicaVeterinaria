package Clinica;

public class Cobra extends Animal{

	private static final long serialVersionUID = 1L;
	
	private String genero;
	
	public Cobra(String nome, int idade, String dono, String cor) {
		super(nome, idade, dono, cor);
		this.especie = "Cobra";
		this.setGenero("Ophidia");
	}
	

	@Override
	public String alimentacao() {
		return "Ratos e Insetos";
	}

	@Override
	public String cuidadosProprios() {
		return "Alimentar e aquecer";
	}

	@Override
	public String locomocao() {
		return "Rastejando";
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
