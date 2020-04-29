package com.myapp.demo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myapp.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	List<Product> deleteById(int productId);
	List<Product> findById(int productId);
	List<Product> findByPriceGreaterThan(double price);
}


