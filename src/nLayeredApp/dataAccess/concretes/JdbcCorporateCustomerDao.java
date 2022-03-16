package nLayeredApp.dataAccess.concretes;

import java.util.List;

import nLayeredApp.entities.concretes.CorporateCustomer;

public class JdbcCorporateCustomerDao implements CorporateCustomerDao {

	@Override
	public void add(CorporateCustomer corporateCustomer) {
        System.out.println(corporateCustomer.getCompanyName()+ "Jdbc ile eklendi");		
		
	}

	@Override
	public void delete(CorporateCustomer corporateCustomer) {
        System.out.println(corporateCustomer.getCompanyName()+ "Jdbc ile eklendi");		
		
	}

	@Override
	public void update(CorporateCustomer corporateCustomer) {
		
	}

	@Override
	public List<CorporateCustomer> getAll() {
		return null;
	}

}
