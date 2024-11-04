package com.web_api.demo.controller;

import com.web_api.demo.model.Product;
import com.web_api.demo.repository.ProductRepository;
import com.web_api.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        log.info("passei");
        return ResponseEntity.ok(productService.findAll());
    }
//
//    @PostMapping
//    public Product add(@RequestBody Product product){return productRepository.save(product);}

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        Product product = productService.getById(id);

        if(product==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return  ResponseEntity.ok(productService.getById(id));

    }

    //delete by id

}
