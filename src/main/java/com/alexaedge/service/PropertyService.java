package com.alexaedge.service;

import com.alexaedge.model.Property;
import com.alexaedge.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository repository;

    public List<Property> getAllProperties() {
        return repository.findAll();
    }
}
