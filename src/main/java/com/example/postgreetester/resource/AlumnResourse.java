package com.example.postgreetester.resource;

<<<<<<< HEAD
import com.example.postgreetester.domain.model.Usuario;
import com.example.postgreetester.domain.repository.UserRepository;
=======
import com.example.postgreetester.domain.model.Aluno;
import com.example.postgreetester.domain.repository.AlunoRepository;
>>>>>>> cfc82032a91ce96c00a8eb9a0223834313308dd0
import com.example.postgreetester.infra.URI_API_PATH;
import com.example.postgreetester.resource.support.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
<<<<<<< HEAD
@RequestMapping(value = URI_API_PATH.USER_API)
public class AlumnResourse extends AbstractRestController<Usuario, Long> {

    @Autowired
    UserRepository repository;
=======
@RequestMapping(value = URI_API_PATH.ALUMNS_API)
public class AlumnResourse extends AbstractRestController<Aluno, Long> {

    @Autowired
    AlunoRepository repository;
>>>>>>> cfc82032a91ce96c00a8eb9a0223834313308dd0
    @Override
    public CrudRepository getRepository() {
        return repository;
    }
}
