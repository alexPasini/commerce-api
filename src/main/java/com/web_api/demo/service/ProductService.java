package com.web_api.demo.service;

import com.web_api.demo.model.Product;
import com.web_api.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product getById(Long id){

        return  productRepository.findById(id).orElse(null);
    }
}
