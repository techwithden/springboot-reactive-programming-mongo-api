package com.rmc.Reactive.CRUD.mongo.repository;

import com.rmc.Reactive.CRUD.mongo.dto.ProductDto;
import com.rmc.Reactive.CRUD.mongo.entity.Product;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, Integer> {

    Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);
}
