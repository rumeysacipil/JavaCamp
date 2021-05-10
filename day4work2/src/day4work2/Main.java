package day4work2;

import java.time.LocalDate;

import day4work2.Abstract.BaseCustomerManager;

import day4work2.Adapters.MernisServiceAdapter;
import day4work2.Concrete.CustomerChcekManager;
import day4work2.Concrete.NeroCustomerManager;
import day4work2.Concrete.StarbucksCustomerManager;
import day4work2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        BaseCustomerManager baseCustomerManager=new NeroCustomerManager(new CustomerChcekManager());
			
        
         Customer customer=new Customer();
         customer.setId(1);
         customer.setFirstName("Rumeysa");
         customer.setLastName("çipil");
         customer.setNationalityId("15241452445");
         customer.setDateOfBirth(LocalDate.of(2000, 7, 15));
         customerManager.save(customer);
         
         Customer customer1=new Customer();
         customer1.setId(2);
         customer1.setFirstName("Feyza");
         customer1.setLastName("barýþ");
         customer1.setNationalityId("25149678523");
         customer1.setDateOfBirth(LocalDate.of(2015, 10, 5));
         baseCustomerManager.save(customer1);
        		 
	}

}
