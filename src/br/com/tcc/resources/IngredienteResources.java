package br.com.tcc.resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.tcc.exception.NoContentException;
import br.com.tcc.model.Ingrediente;
import br.com.tcc.model.IngredienteBusiness;
import br.com.tcc.utils.Constantes;

import com.google.gson.Gson;

@Path("/ingrediente")
public class IngredienteResources {

	@GET
	@Path("/buscarTodos")
	@Produces("application/json")
	public ArrayList<Ingrediente> selTodos() {
		return new IngredienteBusiness().buscarTodos();
	}

	/**
	 * Objetivo: apresentar o Json de todos os Ingredientes usando a biblioteca
	 * GSON
	 * 
	 * @return
	 */
	@GET
	@Path("/buscarTodosGSON")
	@Produces("application/json")
	public String buscaTodosGSON() {

		return new Gson().toJson(new IngredienteBusiness().buscarTodos());

	}

	/**
	 * Objetivo: apresentar o Json de apenas um Restaurante
	 * 
	 * @param int id
	 * @return Prato prato
	 */
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Ingrediente getIngrediente(@PathParam("id") int id) {
		Ingrediente ingrediente = new IngredienteBusiness().buscar(id);

		if (ingrediente == null)
			throw new NoContentException(Constantes.INGREDIENTE_NAO_ENCONTRADO);

		return ingrediente;

	}

	@GET
	@Path("/delete/{id}")
	@Produces("application/json")
	public String deleteIngrediente(@PathParam("id") int id) {
		return new IngredienteBusiness().deletar(id);
	}

	@POST
	@Path("/inserir")
	@Produces("application/json")
	@Consumes("application/json")
	public String inserirIngrediente(Ingrediente ingrediente) {
		return new IngredienteBusiness().inserir(ingrediente);
	}

}
