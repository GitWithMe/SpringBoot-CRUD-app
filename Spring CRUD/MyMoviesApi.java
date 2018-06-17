package io.namitproject.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "io.namitproject.springbootquickstart.hello")
@ComponentScan(basePackages = "io.namitproject.springbootquickstart.movielist")
public class MyMoviesApi {

	public static void main(String[] args) {
		//Creating a servelet container to Host MyMoviesApi through the following static function
		SpringApplication.run(MyMoviesApi.class, args);

	}

}
