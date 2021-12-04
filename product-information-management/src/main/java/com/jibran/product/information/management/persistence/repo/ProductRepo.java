package com.jibran.product.information.management.persistence.repo;


import com.jibran.product.information.management.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    Optional<Product> findBySku(Long sku);
}
