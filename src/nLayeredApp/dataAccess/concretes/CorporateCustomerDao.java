package nLayeredApp.dataAccess.concretes;

import java.util.List;

import nLayeredApp.entities.concretes.CorporateCustomer;


public interface CorporateCustomerDao {
	void add (CorporateCustomer corporateCustomer);
	void delete (CorporateCustomer corporateCustomer);
	void update (CorporateCustomer corporateCustomer);
	List<CorporateCustomer> getAll();
	
	
}
