package io.namitproject.springbootquickstart.movielist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  /*With the help of this class, we run the movies API as a service*/

import org.springframework.stereotype.Service;

@Service
public class MovieService {

	
private	List<Lists> movies =new ArrayList<>( Arrays.asList( //Designing the RESTful API according the respective id,name,desc
			  new Lists("1","Shawshank Redemption","Wrongly Accused Convict plots to break free and makes a good friend on the way"),
			  new Lists("2","The Matrix","In an apocolyptic future, humans are put into a fake reality created by Machines"),
			  new Lists("3","Avengers: Infinity War","Mr Stark, I don't feel so good")
			)); //using the new ArrayList<>() converts this into a mutable Array making further CRUD operations possible

public List<Lists> getAllMovies() { 
	
	return movies;
}

public Lists getMovie(String id) { //returns a specific id during HTTP Request
	//So now we need to iterate among the arrays list stored in the movies variable so for this we use JAVA 8 features of Streams and Lambda
	//and then match the id to be obtained
	return movies.stream().filter(m -> m.getId().equals(id)).findFirst().get();
}

public void addMovie(Lists newmovie) {
	movies.add(newmovie); //adding a new JSON object into the movies variable of Line 13
}

public void updateMovie(String id, Lists newmovie) {
	for(int i = 0 ; i < movies.size() ; i++) {
		Lists m = movies.get(i);
		if(m.getId().equals(id)) {
			movies.set(i, newmovie);
			return;
		}
	}
}

public void deleteMovie(String id) {
	movies.removeIf(m -> m.getId().equals(id));
}
		

}
