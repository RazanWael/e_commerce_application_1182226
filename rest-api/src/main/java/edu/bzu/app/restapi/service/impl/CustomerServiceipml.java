package edu.bzu.app.restapi.service.impl;



import edu.bzu.app.restapi.dto.CustomerDto;
import edu.bzu.app.restapi.entity.Customer;
import edu.bzu.app.restapi.exception.ResourceNotFoundException;
import edu.bzu.app.restapi.repository.CustomerRepository;
import edu.bzu.app.restapi.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceipml implements CustomerService {

        private CustomerRepository customerRepository;

        public CustomerServiceipml(CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
        }

        @Override
        public CustomerDto createCustomer(CustomerDto customerDto) {
            Customer customer = mapToEntity(customerDto);
            Customer newCustomer = customerRepository.save(customer);
            CustomerDto customerResponse = mapToDTO(newCustomer);
            return customerResponse;
        }

        @Override
        public List<CustomerDto> getAllCustomer() {
            List<Customer> customer = customerRepository.findAll();
            return customer.stream().map(customer1 -> mapToDTO(customer1)).collect(Collectors.toList());
        }

        @Override
        public CustomerDto getCustomerById(long id) {
            Customer customer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer", "id", id));
            return mapToDTO(customer);
        }

        @Override
        public CustomerDto updateCustomer(CustomerDto customerDto, long id) {

            Customer customer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer", "id", id));

            customer.setFullName(customerDto.getFullName());
            customer.setGender(customerDto.getGender());
            customer.setEmail(customerDto.getEmail());
            customer.setPhoneNumber(customerDto.getPhoneNumber());

            Customer updatedCustomer = customerRepository.save(customer);
            return mapToDTO(updatedCustomer);
        }

        @Override
        public void deleteCustomerById(long id) {
            Customer customer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer", "id", id));
            customerRepository.delete(customer);
        }

        private CustomerDto mapToDTO(Customer customer){
            CustomerDto customerDto = new CustomerDto();
            customerDto.setId(customer.getId());
            customerDto.setFullName(customer.getFullName());
            customerDto.setGender(customer.getGender());
            customerDto.setEmail(customer.getEmail());
            customerDto.setPhoneNumber(customer.getPhoneNumber());

            return customerDto;
        }

        private Customer mapToEntity(CustomerDto customerDto){
            Customer customer = new Customer();
            customer.setFullName(customerDto.getFullName());
            customer.setGender(customerDto.getGender());
            customer.setPhoneNumber(customerDto.getPhoneNumber());
            customer.setEmail(customerDto.getEmail());
            return customer;
        }




}
