package product.vo;

import org.apache.ibatis.type.Alias;

@Alias("Product")
public class Product {
	private int productId;
	private String productName;
	private String ex;
	private int price;
	private String nation;
	private String year;
	private String matchFoodName;
	private int stock;
	private String img;

	public Product() {
	}
	
	

	public Product(int productId, String productName, String ex, int price, String nation, String year,
			String matchFoodName, int stock, String img) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ex = ex;
		this.price = price;
		this.nation = nation;
		this.year = year;
		this.matchFoodName = matchFoodName;
		this.stock = stock;
		this.img = img;
	}
	



	public Product(String productName, String ex, int price, String nation, String year, String matchFoodName, int stock,
			String img) {
		super();
		this.productName = productName;
		this.ex = ex;
		this.price = price;
		this.nation = nation;
		this.year = year;
		this.matchFoodName = matchFoodName;
		this.stock = stock;
		this.img = img;
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

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getmatchFoodName() {
		return matchFoodName;
	}

	public void setmatchFoodName(String matchFoodName) {
		this.matchFoodName = matchFoodName;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
