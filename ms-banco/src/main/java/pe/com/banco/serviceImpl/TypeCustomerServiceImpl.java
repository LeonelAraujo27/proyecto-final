package pe.com.banco.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banco.entity.TypeCustomer;
import pe.com.banco.repository.TypeCustomerRepository;
import pe.com.banco.service.TypeCustomerService;

import java.util.List;

@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {

    @Autowired
    public TypeCustomerRepository typeCustomerRepository;

    @Override
    public List<TypeCustomer> findAll() {
        return typeCustomerRepository.findAll();
    }
}
