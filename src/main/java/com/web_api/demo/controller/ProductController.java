package com.web_api.demo.controller;

import com.web_api.demo.model.Product;
import com.web_api.demo.repository.ProductRepository;
import com.web_api.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
//
//    @GetMapping
//    public List<Product> findAll() {return productRepository.findAll();}
//
//    @PostMapping
//    public Product add(@RequestBody Product product){return productRepository.save(product);}

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id){return  ResponseEntity.ok(productService.getById(id));}

}
