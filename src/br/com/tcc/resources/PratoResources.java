package br.com.tcc.resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.tcc.exception.NoContentException;
import br.com.tcc.model.Prato;
import br.com.tcc.model.PratoBusiness;
import br.com.tcc.utils.Constantes;

import com.google.gson.Gson;

@Path("/prato")
public class PratoResources {

	/**
	 * Objetivo: apresentar o JSon de todos os Pratos usando a biblioteca Jersey
	 * 
	 * @return ArrayList<Prato>
	 */
	@GET
	@Path("/buscarTodos")
	@Produces("application/json")
	public ArrayList<Prato> buscarTodos() {

		return new PratoBusiness().buscarTodos();

	}

	/**
	 * Objetivo: apresentar o Json de todos os Pratos usando a biblioteca GSON
	 * 
	 * @return
	 */
	@GET
	@Path("/buscarTodosGSON")
	@Produces("application/json")
	public String buscaTodosGSON() {

		return new Gson().toJson(new PratoBusiness().buscarTodos());

	}

	/**
	 * Objetivo: apresentar o Json de apenas um prato
	 * 
	 * @param int id
	 * @return Prato prato
	 */
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Prato getPrato(@PathParam("id") int id) {
		Prato prato = new PratoBusiness().buscar(id);

		if (prato == null)
			throw new NoContentException(Constantes.PRATO_NAO_ENCONTRADO);

		return prato;

	}

	@GET
	@Path("/delete/{id}")
	@Produces("application/json")
	public String deletePrato(@PathParam("id") int id) {
		return new PratoBusiness().deletar(id);
	}

	@POST
	@Path("/inserir")
	@Produces("application/json")
	@Consumes("application/json")
	public String inserirPrato(Prato prato) {
		return new PratoBusiness().inserir(prato);
	}

	/**
	 * Objetivo: apresentar o os pratos de um determinado restaurante
	 * 
	 * @param int id
	 * @return ArrayList<Prato> prato
	 */
	@GET
	@Path("/restaurantePrato/{id}")
	@Produces("application/json")
	public ArrayList<Prato> buscar(@PathParam("id") int id) {
		return new PratoBusiness().buscarRestaurante(id);

	}

}
