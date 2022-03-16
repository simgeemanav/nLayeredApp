package nLayeredApp.dataAccess.concretes;

import java.util.List;

import nLayeredApp.entities.concretes.IndividualCustomer;

public class HibernateIndividualCustomerDao implements IndividualCustomerDao {

	@Override
	public void add(IndividualCustomer individualCustomer) {
          System.out.println(individualCustomer.getFirstName()+ "Hibernate ile eklendi");		
	}

	@Override
	public void delete(IndividualCustomer individualCustomer) {
        System.out.println(individualCustomer.getFirstName()+ "Hibernate ile silindi");		
		
	}

	@Override
	public void update(IndividualCustomer individualCustomer) {
		
	}

	@Override
	public List<IndividualCustomer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
