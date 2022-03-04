package pe.com.banco.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banco.entity.TypeProduct;
import pe.com.banco.repository.TypeCustomerRepository;
import pe.com.banco.repository.TypeProductRepository;
import pe.com.banco.service.TypeProductService;

import java.util.List;

@Service
public class TypeProductServiceImpl implements TypeProductService{

    @Autowired
    public TypeProductRepository typeProductRepository;

    @Override
    public List<TypeProduct> findAll() {
        return typeProductRepository.findAll();
    }

}