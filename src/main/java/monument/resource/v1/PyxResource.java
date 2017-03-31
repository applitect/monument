package monument.resource.v1;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import monument.api.Pyx;

@Api("pyxes")
@Path("v1/pyxes")
@Produces(MediaType.APPLICATION_JSON)
public class PyxResource {

	@ApiOperation(value = "retrieve a pyx by unique id")
	@GET
	public Pyx getPyxes(@QueryParam("uid") Optional<String> uid) {
		return new Pyx();
	}
}
