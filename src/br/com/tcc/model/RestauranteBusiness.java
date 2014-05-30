package br.com.tcc.model;

import java.util.ArrayList;

import br.com.tcc.DAO.RestauranteDAO;
import br.com.tcc.utils.Constantes;

/**
 * @author BrunoMeira
 * @date 30/03/2013
 */
public class RestauranteBusiness {

	/**
	 * Objetivo: buscar todos os restaurantes cadastrados
	 * 
	 * @return ArrayList<Restaurante>
	 */
	public ArrayList<Restaurante> buscarTodos() {
		RestauranteDAO restauranteDAO = new RestauranteDAO();
		return restauranteDAO.buscarTodos();
	}

	/**
	 * Objetivo: buscar apenas um restaurante
	 * 
	 * @param int id
	 * @return Restaurante restaurante
	 */
	public Restaurante buscar(int id) {

		RestauranteDAO restauranteDAO = new RestauranteDAO();
		return restauranteDAO.buscar(id);

	}

	/**
	 * Objetivo: inserir restaurantes
	 * 
	 * @param Restaurante
	 *            restaurante
	 * @return Mensagem de confirmação ou falha
	 */
	public String inserir(Restaurante restaurante) {

		RestauranteDAO restauranteDAO = new RestauranteDAO();

		if (restauranteDAO.inserir(restaurante) > 0) {

			return Constantes.RESTAURANTE_INSERIDO_SUCESSO;

		} else {

			return Constantes.RESTAURANTE_FALHA_INSERCAO;
		}
	}

	/**
	 * Objetivo: remover restaurante
	 * 
	 * @param int id
	 * @return Mensagem de confirmação ou falha
	 */
	public String deletar(int id) {

		RestauranteDAO restauranteDAO = new RestauranteDAO();

		if (restauranteDAO.deletar(id) > 0) {

			return Constantes.RESTAURANTE_REMOVIDO_COM_SUVESSO;

		} else {

			return Constantes.RESTAURANTE_NAO_EXISTE;
		}
	}

}
