package claire.sample;

public class Product2 {

	private String productName;
	private int price;
	private String category;
	private int stock;
	private String size;

	public Product2() {
	}

	public Product2(String productName, int price, String category, int stock, String size) {
		this.productName = productName;
		this.price = price;
		this.category = category;
		this.stock = stock;
		this.size = size;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
