package day4work2.Concrete;

import day4work2.Abstract.CustomerCheckService;
import day4work2.Entities.Customer;

public class CustomerChcekManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
