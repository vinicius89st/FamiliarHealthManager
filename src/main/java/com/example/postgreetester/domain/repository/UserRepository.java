package com.example.postgreetester.domain.repository;

import com.example.postgreetester.domain.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<Usuario, Long> {
    List<Usuario> findByName(String name);

}
