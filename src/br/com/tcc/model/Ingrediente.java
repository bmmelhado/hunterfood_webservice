package br.com.tcc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ingrediente {
	private int idIngrediente;
	private String nome;

	/**
	 * @return the idIngredientes
	 */
	public int getIdIngredientes() {
		return idIngrediente;
	}

	/**
	 * @param idIngredientes
	 *            the idIngredientes to set
	 */
	public void setIdIngredientes(int idIngredientes) {
		this.idIngrediente = idIngredientes;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

}
