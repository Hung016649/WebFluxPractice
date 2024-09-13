package com.thuyhoang.WebFluxPractice.repository;

import com.thuyhoang.WebFluxPractice.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}
