package com.sahiljalan.service;

import java.util.List;

import com.sahiljalan.model.Customer;
import com.sahiljalan.repository.CustomerRepository;
import com.sahiljalan.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.sahiljalan.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.fineAll();
	}

}
