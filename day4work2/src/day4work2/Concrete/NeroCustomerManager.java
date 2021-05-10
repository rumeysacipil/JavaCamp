package day4work2.Concrete;

import day4work2.Abstract.BaseCustomerManager;
import day4work2.Abstract.CustomerCheckService;
import day4work2.Entities.Customer;


public class NeroCustomerManager extends BaseCustomerManager {
   private CustomerCheckService customerCheckService;

public NeroCustomerManager(CustomerCheckService customerCheckService) {
	super();
	this.customerCheckService = customerCheckService;
}

@Override
public void save(Customer customer) {
	if (customerCheckService.checkIfRealPerson(customer)) {
		super.save(customer);
	} else {
		System.out.println("kullanıcı bulunamadı");
	}
}

}
