package br.com.tcc.resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.tcc.exception.NoContentException;
import br.com.tcc.model.Restaurante;
import br.com.tcc.model.RestauranteBusiness;
import br.com.tcc.utils.Constantes;

import com.google.gson.Gson;

@Path("/restaurante")
public class RestauranteResources {

	@GET
	@Path("/buscarTodos")
	@Produces("application/json")
	public ArrayList<Restaurante> selTodos() {
		return new RestauranteBusiness().buscarTodos();
	}

	/**
	 * Objetivo: apresentar o Json de todos os Restaurantes usando a biblioteca
	 * GSON
	 * 
	 * @return
	 */
	@GET
	@Path("/buscarTodosGSON")
	@Produces("application/json")
	public String buscaTodosGSON() {

		return new Gson().toJson(new RestauranteBusiness().buscarTodos());

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
	public Restaurante getRestaurante(@PathParam("id") int id) {
		Restaurante restaurante = new RestauranteBusiness().buscar(id);

		if (restaurante == null)
			throw new NoContentException(Constantes.RESTAURANTE_NAO_ENCONTRADO);

		return restaurante;

	}

	@GET
	@Path("/delete/{id}")
	@Produces("application/json")
	public String deleteRestaurante(@PathParam("id") int id) {
		return new RestauranteBusiness().deletar(id);
	}

	@POST
	@Path("/inserir")
	@Produces("application/json")
	@Consumes("application/json")
	public String inserirRestaurante(Restaurante restaurante) {
		return new RestauranteBusiness().inserir(restaurante);
	}

}
