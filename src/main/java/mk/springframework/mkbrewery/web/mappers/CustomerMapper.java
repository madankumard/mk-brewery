package mk.springframework.mkbrewery.web.mappers;

import mk.springframework.mkbrewery.domain.Customer;
import mk.springframework.mkbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);
    CustomerDto customerToCustomerDto(Customer customer);
}
