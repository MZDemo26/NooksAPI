package com.edu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.Model.ProductCatalog;

@Repository
public interface ProductCatalogRepository extends JpaRepository<ProductCatalog, Integer>{

}
