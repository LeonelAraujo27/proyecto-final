package pe.com.banco.service;

import java.util.List;

import pe.com.banco.entity.Product;

public interface ProductService {

	List<Product> findAll();
	Product create(Product product);
}
