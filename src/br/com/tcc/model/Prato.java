package br.com.tcc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Prato {
	private int idPrato;
	private String descricao;
	private double preco;
	private String nome;
	private int idRestaurante;

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
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * @param preco
	 *            the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
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

	/**
	 * @return the idRestaurante
	 */
	public int getIdRestaurante() {
		return idRestaurante;
	}

	/**
	 * @param idRestaurante
	 *            the idRestaurante to set
	 */
	public void setIdRestaurante(int idRestaurante) {
		this.idRestaurante = idRestaurante;
	}
	/**
	 * @return the ingredientes
	 */
	// public ArrayList<Ingrediente> getIngredientes() {
	// return ingredientes;
	// }
	/**
	 * @param ingredientes
	 *            the ingredientes to set
	 */
	// public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
	// this.ingredientes = ingredientes;
}
