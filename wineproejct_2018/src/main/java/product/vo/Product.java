package product.vo;

import org.apache.ibatis.type.Alias;

@Alias("Product")
public class Product {
	private int productId;
	private String producer;
	private String variety;
	private String wineKinds;
	private String productName; 
	private String wineEx;
	private String brandEx;
	private int price;
	private String nation;
	private String nationImg;
	private String year;
	private String matchFoodId;
	private String matchFoodName;
	private String alcohol;
	private String weight;
	private String temperature;
	private String img;
	private int count;

	public Product() {

	}

	public Product(int productId, String producer, String variety, String wineKinds, String productName, String wineEx,
			String brandEx, int price, String nation, String nationImg, String year, String matchFoodId,
			String matchFoodName, String alcohol,String weight, String temperature, String img, int count) {
		this.productId = productId;
		this.producer = producer;
		this.variety = variety;
		this.wineKinds = wineKinds;
		this.productName = productName;
		this.wineEx = wineEx;
		this.brandEx = brandEx;
		this.price = price;
		this.nation = nation;
		this.nationImg = nationImg;
		this.year = year;
		this.matchFoodId = matchFoodId;
		this.matchFoodName = matchFoodName;
		this.alcohol = alcohol;
		this.weight = weight;
		this.temperature = temperature;
		this.img = img;
		this.count = count;
	}
	
	public Product(String producer, String variety, String wineKinds, String productName, String wineEx,
			String brandEx, int price, String nation, String nationImg, String year, String matchFoodId,
			String matchFoodName, String alcohol,String weight, String temperature, String img, int count) {
		this.producer = producer;
		this.variety = variety;
		this.wineKinds = wineKinds;
		this.productName = productName;
		this.wineEx = wineEx;
		this.brandEx = brandEx;
		this.price = price;
		this.nation = nation;
		this.nationImg = nationImg;
		this.year = year;
		this.matchFoodId = matchFoodId;
		this.matchFoodName = matchFoodName;
		this.alcohol = alcohol;
		this.weight = weight;
		this.temperature = temperature;
		this.img = img;
		this.count = count;
	}

	public Product(String producer, String variety, String wineKinds, String productName, String wineEx, String brandEx,
			int price, String nation, String nationImg, String year, String matchFoodId, String matchFoodName,String alcohol,
			String weight,String temperature , String img) {
		this.producer = producer;
		this.variety = variety;
		this.wineKinds = wineKinds;
		this.productName = productName;
		this.wineEx = wineEx;
		this.brandEx = brandEx;
		this.price = price;
		this.nation = nation;
		this.nationImg = nationImg;
		this.year = year;
		this.matchFoodId = matchFoodId;
		this.matchFoodName = matchFoodName;
		this.alcohol = alcohol;
		this.weight = weight;
		this.temperature = temperature;
		this.img = img;
	}

	
	public String getNationImg() {
		return nationImg;
	}

	public void setNationImg(String nationImg) {
		this.nationImg = nationImg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getWineKinds() {
		return wineKinds;
	}

	public void setWineKinds(String wineKinds) {
		this.wineKinds = wineKinds;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getWineEx() {
		return wineEx;
	}

	public void setWineEx(String wineEx) {
		this.wineEx = wineEx;
	}

	public String getBrandEx() {
		return brandEx;
	}

	public void setBrandEx(String brandEx) {
		this.brandEx = brandEx;
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

	public String getMatchFoodId() {
		return matchFoodId;
	}

	public void setMatchFoodId(String matchFoodId) {
		this.matchFoodId = matchFoodId;
	}

	public String getMatchFoodName() {
		return matchFoodName;
	}

	public void setMatchFoodName(String matchFoodName) {
		this.matchFoodName = matchFoodName;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
