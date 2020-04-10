package pl.info.czerniak.simplerestapp.api;

import pl.info.czerniak.simplerestapp.model.Person;
import pl.info.czerniak.simplerestapp.model.PersonDb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("/persons")
public class PersonResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<Long, Person> getPersons(){
        return PersonDb.getPersons();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("id") Long id){
        return PersonDb.getPersons().get(id);
    }
}
