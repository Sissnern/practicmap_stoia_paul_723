package org.example.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Driver;

import java.io.File;
import java.util.List;

public class DriverRepository {

    public List<Driver> loadDrivers(String path) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(
                    new File(path),
                    new TypeReference<List<Driver>>() {}
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
