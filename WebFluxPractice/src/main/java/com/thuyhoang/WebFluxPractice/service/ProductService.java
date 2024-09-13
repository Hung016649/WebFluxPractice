package com.thuyhoang.WebFluxPractice.service;

import com.thuyhoang.WebFluxPractice.dto.ProductDTO;
import com.thuyhoang.WebFluxPractice.repository.ProductRepository;
import com.thuyhoang.WebFluxPractice.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Flux<ProductDTO> getProducts(){
        return repository.findAll().map(AppUtils::entityToDto);
    }

    public Mono<ProductDTO> getProduct(String id){
        return repository.findById(id).map(AppUtils::entityToDto);
    }

    public Mono<ProductDTO> saveProduct(Mono<ProductDTO> productDtoMono){
        return productDtoMono.map(AppUtils::dtoToEntity)
                .flatMap(repository::insert)
                .map(AppUtils::entityToDto);
    }
}
