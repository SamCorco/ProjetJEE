package fr.cpe.rest;

import javax.json.Json;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import fr.cpe.model.User;


@Path("/WatcherAuth")
public interface IWebAuth {
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		void doPost(User u);
		
}


