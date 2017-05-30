package rs.bg.spring.service;

import java.util.List;

import rs.bg.spring.model.Customer;
import rs.bg.spring.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	
	private CustomerRepository customerRep;

	
	public CustomerServiceImpl(){}
	
	public CustomerServiceImpl(CustomerRepository customerRep) {
		super();
		this.customerRep = customerRep;
	}
	
	@Override
	public List<Customer> findAll()
	{
		return customerRep.findAll();		
	}

	public void setCustomerRepository(CustomerRepository customerRep) {
		this.customerRep = customerRep;
	}
}
