package fabio.demo.controller;
import fabio.demo.cadastro.Ordem;
import fabio.demo.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping(path = "/ordens")
public class OrdemController {

    public static Long contador;
    @Autowired
    Repositorio repository;

    @RequestMapping("/home")
    public String home() {
        System.out.print("oi");
        return "oi";

    }


    @GetMapping
    public Optional<Ordem> list(@RequestParam Long id) {
        return repository.findById(id);

    }

    @RequestMapping("/getOrdem")
    public Iterable<Ordem> list() {
        return repository.findAll();

    }

    @RequestMapping("/addOrdem")
    public String addOrdem(Ordem ordem) {
        repository.save(ordem);
        final String s = "Cadastro efetuado com sucesso!!  total de Ordens: " + repository.count();
        return s;
    }

    @RequestMapping("/editOrdem")
    public String editOrdem(Ordem ordem) {
        repository.save(ordem);
        final String s = "Cadastro efetuado com sucesso!!  total de Ordens: " + repository.count();
        return s;
    }

    @GetMapping("/count")
    public Long count() {
        contador = repository.count();
        return contador;
    }
}