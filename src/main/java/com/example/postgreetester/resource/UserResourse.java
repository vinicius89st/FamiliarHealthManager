package com.example.postgreetester.resource;

import com.example.postgreetester.domain.model.Usuario;
import com.example.postgreetester.domain.repository.UserRepository;
import com.example.postgreetester.infra.URI_API_PATH;
import com.example.postgreetester.resource.support.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = URI_API_PATH.USER_API)
public class UserResourse extends AbstractRestController<Usuario, Long> {

    @Autowired
    UserRepository repository;
    @Override
    public CrudRepository getRepository() {
        return repository;
    }
}
