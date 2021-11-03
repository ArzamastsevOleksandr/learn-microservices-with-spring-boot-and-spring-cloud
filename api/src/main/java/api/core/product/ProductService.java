package api.core.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface ProductService {

    @GetMapping(value = "/product/{id}", produces = APPLICATION_JSON_VALUE)
    Product getProduct(@PathVariable int id);

}
