package br.com.blsoft.pdvweb.pdvweb.produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "produtos")
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
