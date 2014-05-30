package br.com.tcc.model;

import java.util.ArrayList;

import br.com.tcc.DAO.PratoDAO;
import br.com.tcc.utils.Constantes;

public class PratoBusiness {

	/**
	 * Objetivo: buscar todos os pratos cadastrados
	 * 
	 * @return ArrayList<Prato>
	 */
	public ArrayList<Prato> buscarTodos() {
		PratoDAO pratoDAO = new PratoDAO();
		return pratoDAO.buscarTodos();
	}

	/**
	 * Objetivo: buscar todos os pratos dos restaurantes
	 * 
	 * @return ArrayList<Prato>
	 */
	public ArrayList<Prato> buscarRestaurante(int id) {
		PratoDAO pratoDAO = new PratoDAO();
		return pratoDAO.buscarRestaurante(id);
	}

	// TODO Implementar busca por todos os pratos de um restaurante

	/**
	 * Objetivo: buscar apenas um prato
	 * 
	 * @param int id
	 * @return Prato prato
	 */
	public Prato buscar(int id) {

		PratoDAO pratoDAO = new PratoDAO();

		return pratoDAO.buscar(id);

	}

	/**
	 * Objetivo: inserir prato
	 * 
	 * @param Prato
	 *            prato
	 * @return Mensagem de confirmação ou falha
	 */
	public String inserir(Prato prato) {

		PratoDAO pratoDAO = new PratoDAO();

		if (pratoDAO.inserir(prato) > 0) {

			return Constantes.PRATO_INSERIDO_SUCESSO;

		} else {

			return Constantes.PRATO_FALHA_INSERCAO;
		}
	}

	/**
	 * Objetivo: remover Prato
	 * 
	 * @param int id
	 * @return Mensagem de confirmação ou falha
	 */
	public String deletar(int id) {

		PratoDAO pratoDAO = new PratoDAO();

		if (pratoDAO.deletar(id) > 0) {

			return Constantes.PRATO_REMOVIDO_COM_SUVESSO;

		} else {

			return Constantes.PRATO_NAO_EXISTE;
		}
	}

}
