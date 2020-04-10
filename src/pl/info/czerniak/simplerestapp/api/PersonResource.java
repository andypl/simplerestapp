package pl.info.czerniak.simplerestapp.api;

import pl.info.czerniak.simplerestapp.model.Person;
import pl.info.czerniak.simplerestapp.model.PersonDb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/persons")
public class PersonResource {

    @GET
    public String getPersons(){
        StringBuilder builder = new StringBuilder();
        builder.append("<html>");
        for(Person p : PersonDb.getPersons().values()){
            builder.append(p.getId());
            builder.append(" ");
            builder.append(p.getFirstName());
            builder.append(" ");
            builder.append(p.getLastName());
            builder.append("<br/>");
        }
        builder.append("</html>");
        return builder.toString();
    }
}
