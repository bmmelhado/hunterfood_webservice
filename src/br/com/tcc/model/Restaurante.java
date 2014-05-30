package br.com.tcc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Restaurante {

	private int idRestaurante;
	private String nome;
	private String descricao;
	private String endereco;
	private String cidade;
	private String especialidadeGastronomica;
	private String horario;

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
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade
	 *            the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the especialidadeGastronomica
	 */
	public String getEspecialidadeGastronomica() {
		return especialidadeGastronomica;
	}

	/**
	 * @param especialidadeGastronomica
	 *            the especialidadeGastronomica to set
	 */
	public void setEspecialidadeGastronomica(String especialidadeGastronomica) {
		this.especialidadeGastronomica = especialidadeGastronomica;
	}

	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * @param horario
	 *            the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

}
