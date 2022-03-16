package nLayeredApp.business.concretes;

import nLayeredApp.dataAccess.concretes.IndividualCustomerDao;
import nLayeredApp.entities.concretes.IndividualCustomer;

public class IndividualCustomerManager {

	private IndividualCustomerDao individualCustomerDao;

	public IndividualCustomerManager(IndividualCustomerDao individualCustomerDao) {
		super();
		this.individualCustomerDao = individualCustomerDao;
	}
	
	public void add(IndividualCustomer customer) {
		individualCustomerDao.add(customer);
		
	}

}









//Bir e ticaret sistemi yazmak istiyoruz
//katmanlı mimari kullanacağız
//katmanları olusturunuz
//ürün ekleme, silme, listeleme operasyonlarını yazınız
// ürün eklenirken daha önce o ürün ismi eklenmişse, ekleme gerçekleşmemeli
