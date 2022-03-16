package nLayeredApp.api;

import nLayeredApp.business.concretes.CorporateCustomerManager;
import nLayeredApp.business.concretes.IndividualCustomerManager;
import nLayeredApp.dataAccess.concretes.HibernateIndividualCustomerDao;
import nLayeredApp.dataAccess.concretes.JdbcCorporateCustomerDao;
import nLayeredApp.entities.concretes.CorporateCustomer;
import nLayeredApp.entities.concretes.IndividualCustomer;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager(new HibernateIndividualCustomerDao());
		individualCustomerManager.add(new IndividualCustomer(1,"12345","Engin","Demiroğ","12345678910"));
		CorporateCustomerManager corporateCustomerManager = new CorporateCustomerManager(new JdbcCorporateCustomerDao());
		corporateCustomerManager.add(new CorporateCustomer(2,"67890","Simge","Manav"));
		
	}

}
