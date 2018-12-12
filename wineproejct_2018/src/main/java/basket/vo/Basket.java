package basket.vo;

import org.apache.ibatis.type.Alias;

@Alias("Basket")
public class Basket {
	private int basketId;
	private int userId;
	private int productId;
	private int matchFoodId;
	private String productName;
	private int productPrice;
	private int productCount; 
	private String productImg;
	private String matchFoodIdList;
	private String matchFoodCount;
	private int total;

	public Basket() {
 
	}

	public Basket(int basketId, int userId, int productId, int matchFoodId, String productName, int productPrice,
			int productCount, String productImg, String matchFoodIdList, String matchFoodCount, int total) {
		super();
		this.basketId = basketId;
		this.userId = userId;
		this.productId = productId;
		this.matchFoodId = matchFoodId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCount = productCount;
		this.productImg = productImg;
		this.matchFoodIdList = matchFoodIdList;
		this.matchFoodCount = matchFoodCount;
		this.total = total;
	}

	public Basket(int userId, int productId, String productName, int productPrice, int productCount, String productImg,
			String matchFoodIdList, String matchFoodCount, int total) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCount = productCount;
		this.productImg = productImg;
		this.matchFoodIdList = matchFoodIdList;
		this.matchFoodCount = matchFoodCount;
		this.total = total;
	}

	public int getBasketId() {
		return basketId;
	}

	public void setBasketId(int basketId) {
		this.basketId = basketId;
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

	public int getMatchFoodId() {
		return matchFoodId;
	}

	public void setMatchFoodId(int matchFoodId) {
		this.matchFoodId = matchFoodId;
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

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public String getMatchFoodIdList() {
		return matchFoodIdList;
	}

	public void setMatchFoodIdList(String matchFoodIdList) {
		this.matchFoodIdList = matchFoodIdList;
	}

	public String getMatchFoodCount() {
		return matchFoodCount;
	}

	public void setMatchFoodCount(String matchFoodCount) {
		this.matchFoodCount = matchFoodCount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}