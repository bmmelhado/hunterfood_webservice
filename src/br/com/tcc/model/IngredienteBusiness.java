package br.com.tcc.model;

import java.util.ArrayList;

import br.com.tcc.DAO.IngredienteDAO;
import br.com.tcc.utils.Constantes;

/**
 * 
 * @author BrunoMeira
 *
 */
public class IngredienteBusiness {

	/**
	 * Objetivo: buscar todos os Ingrediente cadastrados
	 * 
	 * @return ArrayList<Ingrediente>
	 */
	public ArrayList<Ingrediente> buscarTodos() {

		IngredienteDAO ingredienteDAO = new IngredienteDAO();

		return ingredienteDAO.buscarTodos();
	}

	/**
	 * Objetivo: buscar apenas um Ingrediente
	 * 
	 * @param int id
	 * @return Ingrediente ingrediente
	 */
	public Ingrediente buscar(int id) {

		IngredienteDAO ingredienteDAO = new IngredienteDAO();

		return ingredienteDAO.buscar(id);

	}

	/**
	 * Objetivo: inserir ingrediente
	 * 
	 * @param Ingrediente
	 *            ingrediente
	 * @return Mensagem de confirmação ou falha
	 */
	public String inserir(Ingrediente ingrediente) {

		IngredienteDAO ingredienteDAO = new IngredienteDAO();

		if (ingredienteDAO.inserir(ingrediente) > 0) {

			return Constantes.INGREDIENTE_INSERIDO_SUCESSO;

		} else {

			return Constantes.INGREDIENTE_FALHA_INSERCAO;
		}
	}

	/**
	 * Objetivo: remover Ingrediente
	 * 
	 * @param int id
	 * @return Mensagem de confirmação ou falha
	 */
	public String deletar(int id) {

		IngredienteDAO ingredienteDAO = new IngredienteDAO();

		if (ingredienteDAO.deletar(id) > 0) {

			return Constantes.INGREDIENTE_REMOVIDO_COM_SUVESSO;

		} else {

			return Constantes.INGREDIENTE_NAO_EXISTE;
		}
	}

}
