package demo;

/**
 * Created by 154404g on 11/14/2016.
 */


import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.PrintWriter;

/**
 * Created by 154400m on 11/14/2016.
 */
@Path("/book")

public class BookResource {
    String title;
    String description;
    String author;
    int year;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        String json = this.title +" "+ this.description +  " "+this.author + " "+ this.year ;
        Gson gson = new Gson();
        return json;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getResource() {
        Gson gson = new Gson();
        return gson.toJson(new Book());
    }

    public BookResource() {
        this.title = "Java Made Easy";
        this.description = "A book about how to learn Java in a painless manner";
        this.author = "Java Duke";
        this.year = 2016;

    }
}