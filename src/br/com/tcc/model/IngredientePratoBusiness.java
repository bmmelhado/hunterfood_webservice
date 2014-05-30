package br.com.tcc.model;

import java.util.ArrayList;

import br.com.tcc.DAO.IngredientePratoDAO;

public class IngredientePratoBusiness {

	/**
	 * Objetivo: buscar ingrediente do prato
	 * 
	 * @param int id
	 * @return Arraylist ingredientes
	 */
	public ArrayList<IngredientePrato> buscar(int id) {

		IngredientePratoDAO ingredientePratoDAO = new IngredientePratoDAO();

		return ingredientePratoDAO.buscar(id);

	}

}
