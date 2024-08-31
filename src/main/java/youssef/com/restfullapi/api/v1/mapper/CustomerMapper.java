package youssef.com.restfullapi.api.v1.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import youssef.com.restfullapi.api.v1.model.CustomerDTO;
import youssef.com.restfullapi.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
