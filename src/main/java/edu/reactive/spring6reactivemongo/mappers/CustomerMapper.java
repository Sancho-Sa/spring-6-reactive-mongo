package edu.reactive.spring6reactivemongo.mappers;

import edu.reactive.spring6reactivemongo.domain.Customer;
import edu.reactive.spring6reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
