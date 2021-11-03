package api.composite.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface ProductCompositeService {

    @GetMapping(value = "/product-composite/{productId}", produces = APPLICATION_JSON_VALUE)
    ProductAggregate getProduct(@PathVariable int productId);

}
