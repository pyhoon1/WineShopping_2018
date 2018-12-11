package payment.vo;

public class FoodRequest {
	private int userId;
	private int matchFoodId;
	private String productName;
	private int productPrice;
	private int productCount;
	private String productImg;
	private String method;

	public FoodRequest(int userId, int matchFoodId, String productName, int productPrice, int productCount,
			String productImg, String method) {
		super();
		this.userId = userId;
		this.matchFoodId = matchFoodId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCount = productCount;
		this.productImg = productImg;
		this.method = method;
	}

	public int getUserId() {
		return userId;
	}

	public int getMatchFoodId() {
		return matchFoodId;
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

	public String getMethod() {
		return method;
	}

}
