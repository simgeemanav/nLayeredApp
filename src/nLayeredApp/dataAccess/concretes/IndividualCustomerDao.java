package nLayeredApp.dataAccess.concretes;

import java.util.List;

import nLayeredApp.entities.concretes.IndividualCustomer;

public interface IndividualCustomerDao {
	
	void add (IndividualCustomer individualCustomer);
	void delete (IndividualCustomer individualCustomer);
	void update (IndividualCustomer individualCustomer);
	List<IndividualCustomer> getAll();
	
	

}
