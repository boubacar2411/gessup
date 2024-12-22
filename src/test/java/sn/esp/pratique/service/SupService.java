package sn.esp.pratique.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.esp.pratique.entity.Category;
import sn.esp.pratique.entity.SupMarcher;
import sn.esp.pratique.repository.CategoryRepos;
import sn.esp.pratique.repository.SupeMarcherRepos;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SupService {
    @Autowired
    private SupeMarcherRepos supeMarcherRepos;
    @Autowired
    private CategoryRepos categoryRepos;
    public void disponibliteProd(String nomProduit) {
         boolean disponible = true;
         String produitRechercher=supeMarcherRepos.findBynomProduit(nomProduit);
         if(produitRechercher!=null) {

             disponible = false;
             System.out.println(produitRechercher);
         }

}

}
