package br.com.ricardosander.listavip.services;

import br.com.ricardosander.listavip.model.Convidado;
import br.com.ricardosander.listavip.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvidadoService {

    @Autowired
    private ConvidadoRepository repository;

    public void salvar(Convidado convidado) {
        repository.save(convidado);
    }

    public Iterable<Convidado> buscaTodos() {
        return repository.findAll();
    }

}
