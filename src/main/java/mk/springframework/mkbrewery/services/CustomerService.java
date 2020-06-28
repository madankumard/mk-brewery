package mk.springframework.mkbrewery.services;

import mk.springframework.mkbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
