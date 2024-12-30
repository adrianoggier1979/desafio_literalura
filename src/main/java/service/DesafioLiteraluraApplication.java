package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import principal.Principal;
import repositorio.IAutoresRepository;
import repositorio.ILibrosRepository;

@SpringBootApplication
public class DesafioLiteraluraApplication implements CommandLineRunner {

    @Autowired
    private IAutoresRepository autoresRepository;
    @Autowired
    private ILibrosRepository librosRepository;
    public static void main(String[] args) {
        SpringApplication.run(DesafioLiteraluraApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(autoresRepository, librosRepository);
        principal.muestraElMenu();
    }


}
