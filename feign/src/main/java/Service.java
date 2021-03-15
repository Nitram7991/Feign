import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


@FeignClient(name = "microservice-produits", url = "localhost:9001")
public interface Service {
    @GetMapping(value = "/Produits")
    List<Product> listeDesProduits();

    @GetMapping( value = "/Produits/{id}")
    Product recupererUnProduit(@PathVariable("id") int id);
}





