package pe.com.banco.service;

import pe.com.banco.entity.TypeProduct;

import java.util.List;

public interface TypeProductService {
    List<TypeProduct> findAll();
}