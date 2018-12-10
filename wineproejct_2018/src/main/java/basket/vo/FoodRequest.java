package basket.vo;

import org.apache.ibatis.type.Alias;

@Alias("FoodRequest")
public class FoodRequest {

	private int userId;
	private int matchFoodId;
	private String productName;
	private int productPrice;
	private int productCount;
	private String productImg;
	private int total;
 
	public FoodRequest(int userId, int matchFoodId, String productName, int productPrice, int productCount,
			String productImg, int total) {
		super();
		this.userId = userId;
		this.matchFoodId = matchFoodId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCount = productCount;
		this.productImg = productImg;
		this.total = total;
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

	public int getTotal() {
		return total;
	}

}
