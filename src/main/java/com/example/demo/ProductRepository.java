package com.example.demo;

import org.springframework.data.repository.CrudRepository;

// Product Entity를  Repository패턴으로 선언
public interface ProductRepository extends CrudRepository<Product, Long> {
    //기본적인  CRUD가 자동 생성됨.
}
