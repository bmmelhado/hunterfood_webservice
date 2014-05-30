package br.com.tcc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IngredientePrato {
	private int idPrato;
	private int idIngrediente;
	private String nome;

	/**
	 * @return the idPrato
	 */
	public int getIdPrato() {
		return idPrato;
	}

	/**
	 * @param idPrato
	 *            the idPrato to set
	 */
	public void setIdPrato(int idPrato) {
		this.idPrato = idPrato;
	}

	/**
	 * @return the idIngrediente
	 */
	public int getIdIngrediente() {
		return idIngrediente;
	}

	/**
	 * @param idIngrediente
	 *            the idIngrediente to set
	 */
	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
