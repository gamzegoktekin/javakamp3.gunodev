package staticDemo;

public class ProductValidator {
	// bir ürünü güncellerken ürünün kurallara uyup uymadığını bulmak için
	// kullanılır

	static {
		System.out.println("Yapıcı blok çalıştı");
	}

	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");

	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public void birşey() {

	}
	
	public class BaskaBirClass{
		//gruplandırma amaçlı kullanılır. temel class onlar içinde yapılacak classlar olabilir.
	}

}
