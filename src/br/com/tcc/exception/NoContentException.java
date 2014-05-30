package br.com.tcc.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class NoContentException extends WebApplicationException {

    /**
	 * Id
	 */
	private static final long serialVersionUID = -2519141516060547716L;

	public NoContentException(String mensagem) {
     super(Response.status(Status.NOT_FOUND).entity(mensagem).build());
    }
    
}