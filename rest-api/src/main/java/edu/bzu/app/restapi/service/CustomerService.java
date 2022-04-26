package edu.bzu.app.restapi.service;


import edu.bzu.app.restapi.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

        CustomerDto createCustomer(CustomerDto CustomerDto);

        List<CustomerDto> getAllCustomer();

        CustomerDto getCustomerById(long id);

        CustomerDto updateCustomer(CustomerDto CustomerDto, long id);

        void deleteCustomerById(long id);


}
