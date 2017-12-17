package claire.sample;

public class Order2 {

	private String userId; // member 클래스
	private String productName; // product 클래스
	private int qty;
	private String orderDate;
	private String orderDest;
	private int orderPrice;

	public Order2() {
	}

	public Order2(String userId, String productName, int qty, String orderDate, String orderDest, int orderPrice) {
		super();
		this.userId = userId;
		this.productName = productName;
		this.qty = qty;
		this.orderDate = orderDate;
		this.orderDest = orderDest;
		this.orderPrice = orderPrice;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderDest() {
		return orderDest;
	}

	public void setOrderDest(String orderDest) {
		this.orderDest = orderDest;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

}
