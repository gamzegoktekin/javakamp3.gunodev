package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if (ProductValidator.isValid(product)) {
		System.out.println("Eklendi");
		}else

	{
		System.out.println("Ürün bilgileri geçersizdir.");
	}
		
		//staticler direkt class ismi ile çağrılır new yapamay gerek yoktur.
}
}
