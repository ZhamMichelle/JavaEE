import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("hello")
public class MyResourse {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getId(){
        return "My resourse";
    }
}
