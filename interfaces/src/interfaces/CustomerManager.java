package interfaces;

public class CustomerManager {
	/*ICustomerDal customerDal;
	public void add() {
		//iş kodları yazılır. parametre göndermek gerekir.
		//OracleCustomerDal oracleCustomerDal =new OracleCustomerDal(); sistem sadece Oracle ile çalışır.
		//interfaceler new yapılamaz
		customerDal.Add();*/
	
	ICustomerDal customerDal;
	public CustomerManager(ICustomerDal ıCustomerDal) {
		this.customerDal = customerDal;
		
		
	}
	public void add() {
		
		
	}

}
