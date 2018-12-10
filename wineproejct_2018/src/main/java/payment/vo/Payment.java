package payment.vo;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

@Alias("Payment")
public class Payment {
	private int userId;
	private int productId;
	private String productName;
	private int productPrice;
	private int basketCount;
	private int total;
	private LocalDateTime wdate;
	
	public Payment() {}

	public Payment(int userId, int productId, String productName, int productPrice, int basketCount, int total,
			LocalDateTime wdate) {
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.basketCount = basketCount;
		this.total = total;
		this.wdate = wdate;
	}

	public Payment(int userId, int productId, String productName, int productPrice, int basketCount, int total) {
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.basketCount = basketCount;
		this.total = total;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getBasketCount() {
		return basketCount;
	}

	public void setBasketCount(int basketCount) {
		this.basketCount = basketCount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public LocalDateTime getWdate() {
		return wdate;
	}

	public void setWdate(LocalDateTime wdate) {
		this.wdate = wdate;
	}
	
	
	
	
	
	
	
	

}
