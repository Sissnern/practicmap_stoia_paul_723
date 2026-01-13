package org.example.repository;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverRepository {
    private List<Driver> Drivers = new ArrayList<>();
    /**
     * Cerința a): Citește datele exclusiv din format JSON[cite: 136, 137].
     */
    public void loadFromJson(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // Citim fișierul și convertim în listă de obiecte Match
        Company[] companyArray = mapper.readValue(new File(filePath), Company[].class);
        this.companies = new ArrayList<>(Arrays.asList(companyArray));
    }

    public List<Company> getAll() {
        return companies;
    }
}
