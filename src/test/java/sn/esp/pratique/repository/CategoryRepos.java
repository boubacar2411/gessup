package sn.esp.pratique.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.esp.pratique.entity.Category;
@RepositoryRestResource
public interface CategoryRepos extends CrudRepository<Category,Long> {
}
