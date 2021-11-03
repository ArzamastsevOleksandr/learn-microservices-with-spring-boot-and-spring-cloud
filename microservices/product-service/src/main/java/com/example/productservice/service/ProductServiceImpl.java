package com.example.productservice.service;

import api.core.product.Product;
import api.core.product.ProductService;
import api.exception.InvalidInputException;
import api.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import util.http.ServiceUtil;

import javax.annotation.PostConstruct;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ServiceUtil serviceUtil;

    @PostConstruct
    void post() {
        log.error("AAAAAAA");
    }

    @Override
//    @GetMapping(value = "/product/{id}", produces = APPLICATION_JSON_VALUE)
    public Product getProduct(int id) {
        log.error("/product return the found product for productId={}", id);
        if (id < 1) {
            throw new InvalidInputException("Invalid productId: " + id);
        }
        if (id == 13) {
            throw new NotFoundException("No product found for productId: " + id);
        }
        return new Product(id, "name-" + id, 123, serviceUtil.getServiceAddress());
    }

}
