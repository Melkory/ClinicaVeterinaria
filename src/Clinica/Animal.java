package Clinica;

import java.io.Serializable;

public abstract class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	private   String nome;
	private   int idade;
	private   String dono;
	protected String especie;
	private String cor;
	
	public Animal(String nome, int idade, String dono, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.dono = dono;
		this.cor = cor;
	}
	
	public String toString() {
		String retorno = "";
		retorno += "Nome: "     			+ this.nome    			+ "\n";
		retorno += "Idade: "    			+ this.idade    		+ " anos\n";
		retorno += "Dono: "     			+ this.dono     		+ "\n";
		retorno += "Especie: "  			+ this.especie  		+ "\n";
		retorno += "Cor: "      			+ this.cor				+ "\n";
		retorno += "Alimentacao: "      	+ alimentacao()			+ "\n";
		retorno += "Cuidados Proprios: "	+ cuidadosProprios()	+ "\n";
		retorno += "Locomoção: "      		+ locomocao()			+ "\n";
		
		return retorno;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public abstract String alimentacao();
	public abstract String cuidadosProprios();
	public abstract String locomocao();
	
}
