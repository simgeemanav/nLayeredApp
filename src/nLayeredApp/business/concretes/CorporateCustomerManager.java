package nLayeredApp.business.concretes;

import nLayeredApp.dataAccess.concretes.CorporateCustomerDao;
import nLayeredApp.entities.concretes.CorporateCustomer;

public class CorporateCustomerManager {
	
	private CorporateCustomerDao corporateCustomerDao;

	public CorporateCustomerManager(CorporateCustomerDao corporateCustomerDao) {
		super();
		this.corporateCustomerDao = corporateCustomerDao;
	}
	
	public void add(CorporateCustomer corporateCustomer) {
		corporateCustomerDao.add(corporateCustomer);
	}
	
	
	

}
