package basket.vo;

import org.apache.ibatis.type.Alias;

@Alias("ProductRequest")
public class ProductRequest {

	private int userId;
	private int productId;
	private String productName;
	private int productPrice;
	private int productCount;
	private String productImg;
 
	private int total;
	
	public ProductRequest() {
		
	}
	public ProductRequest(int userId, int productId, String productName, int productPrice, int productCount,
			String productImg, int total) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCount = productCount;
		this.productImg = productImg;
		this.total = total;
	}

	public int getUserId() {
		return userId;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public int getProductCount() {
		return productCount;
	}

	public String getProductImg() {
		return productImg;
	}

	public int getTotal() {
		return total;
	}

}
