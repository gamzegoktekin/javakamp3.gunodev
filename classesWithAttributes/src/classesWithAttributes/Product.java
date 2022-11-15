package classesWithAttributes;

public class Product<Public> {
	
	public Product(int id, String name, String description, double price,int stockAmount, String renk, String kod) {
	System.out.println("Yapıcı blok çalıştı");
	this.id=id;
	this.name=name;
	this.description=description;
	this.kod=kod;
	this.price=price;
	this.renk=renk;
}
	
	
	private int id;
	private String name;
	private String description;
	private double price;
	int stockAmount;
	private String renk;
	private String kod;
	public String setName;
	
	
	public int getId() {
		return id;
	
	}
	
	public void setId (int id) {
		this.id=id;
	}

	private String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	private String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	private double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	private int getStockAmount() {
		return stockAmount;
	}

	private void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	private String getRenk() {
		return renk;
	}

	private void setRenk(String renk) {
		this.renk = renk;
	}

	String getKod() {
		return this.name.substring(0,1) + id;
	}

	public String name(String string) {
		return null;
	}


	}


