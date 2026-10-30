package br.com.fiap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) {

		String dbUrl = System.getenv("DB_URL");

		System.out.println("DB_URL existe? " + (dbUrl != null));
		System.out.println("Começa com jdbc? " +
				(dbUrl != null && dbUrl.trim().startsWith("jdbc")));



		SpringApplication.run(PokemonApplication.class, args);


	}

}
