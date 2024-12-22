package sn.esp.pratique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import sn.esp.pratique.entity.SupMarcher;

@RepositoryRestResource
public interface SupeMarcherRepos extends JpaRepository<SupMarcher,Long> {
    String findBynomProduit(String nomProduit);
}
