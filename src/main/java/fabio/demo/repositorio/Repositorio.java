package fabio.demo.repositorio;


import fabio.demo.cadastro.Ordem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface Repositorio extends CrudRepository<Ordem, Long> {
}
