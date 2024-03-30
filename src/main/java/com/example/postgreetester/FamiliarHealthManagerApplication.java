package com.example.postgreetester;

import com.example.postgreetester.domain.model.Usuario;
import com.example.postgreetester.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FamiliarHealthManagerApplication implements CommandLineRunner {

    @Autowired
    UserRepository dao;

    public static void main(String[] args) {
        SpringApplication.run(FamiliarHealthManagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Usuario a = new Usuario(1L, "teste", "", "", null);
        dao.save(a);
        System.out.println(dao.findByName("teste"));
    }
}
