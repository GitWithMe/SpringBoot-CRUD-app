package io.namitproject.springbootquickstart.movielist;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Indicates that this class deals with HTTP Requests
public class MovieListControl {
@Autowired //This provides the dependency injection to the instance created in line 13
	//In order to ask for the instance that is created(Service), we do the following 
	private MovieService movieservice;
	
	@RequestMapping("/movieslist") //Maps to all the HTTP Request
	public List<Lists> getAllMovies() {   
	return movieservice.getAllMovies();
	}
	  /*GET ID */
	@RequestMapping("/movieslist/{id}")
	public Lists getMovie(@PathVariable String id) { //returns a specific id during HTTP Request and path variable annotation
	  //is used to tell the spring MVC that the id in line 20 is actually a path variable to a specific item in the array
		return movieservice.getMovie(id); //returning the work done in the Line 23 of MovieService.java
	}
	/*POST new JSON */
	@RequestMapping(method=RequestMethod.POST, value="/movieslist") //Used for POST request in the movieslist link
	public void addMovie(@RequestBody Lists newmovie) { //Tells the spring MVC that your request payload is gonna contain an JSON 
		//representation of the Lists instance, so we are asking the RequestBody convert it to the Lists instance and pass it to the
		//addMovie so that POST request could further get followed
		
		movieservice.addMovie(newmovie); //pass the new movie name in the function to POST so to make this work,
		//refer to line 29 of MovieService.java
		
	}
	   /*UPDATE A JSON id */
	@RequestMapping(method=RequestMethod.PUT, value="/movieslist/{id}") 
	public void updateMovie(@RequestBody Lists newmovie ,@PathVariable String id ) { 
		movieservice.updateMovie(id, newmovie);  //Refer the line 34 of MovieService.java
	}
	
	/*DELETE A JSON id */
	@RequestMapping(method=RequestMethod.DELETE, value="/movieslist/{id}") 
	public void deleteMovie(@PathVariable String id) { 
		 movieservice.deleteMovie(id); //Refer to line 44 of MovieService.java
	

}
	
}
