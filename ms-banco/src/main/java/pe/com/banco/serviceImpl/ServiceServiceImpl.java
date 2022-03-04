package pe.com.banco.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import pe.com.banco.entity.Service;
import pe.com.banco.repository.ServiceRepository;
import pe.com.banco.service.ServiceService;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    public ServiceRepository serviceRepository;

    @Override
    public List<Service> findAll() {
        return serviceRepository.findAll();
    }

}