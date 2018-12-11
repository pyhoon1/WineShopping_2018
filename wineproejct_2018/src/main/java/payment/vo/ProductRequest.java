package payment.vo;

public class ProductRequest {

	private int userId;
	private int productId;
	private String productName;
	private int productPrice;
	private int productCount;
	private String productImg;
	private String matchFoodIdList;
	private String matchFoodCount;
	private String method;

	public ProductRequest(int userId, int productId, String productName, int productPrice, int productCount,
			String productImg, String matchFoodIdList, String matchFoodCount, String method) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCount = productCount;
		this.productImg = productImg;
		this.matchFoodIdList = matchFoodIdList;
		this.matchFoodCount = matchFoodCount;
		this.method = method;
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

	public String getMatchFoodIdList() {
		return matchFoodIdList;
	}

	public String getMatchFoodCount() {
		return matchFoodCount;
	}

	public String getMethod() {
		return method;
	}

}
