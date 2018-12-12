package matchfood.vo;

import org.apache.ibatis.type.Alias;

@Alias("MatchFood")
public class MatchFood {
	private int matchFoodId;
	private String matchFoodName;
	private int price;
	private String nation;
	private String nationImg;
	private String img;
	private String wine;
	private String wineImg;
	private String weight;
	private String ex;
	private String count;

	public MatchFood() {

	}
	
	
	

	public MatchFood(int matchFoodId, String matchFoodName, int price, String nation, String nationImg, String img,
			String wine, String wineImg, String weight, String ex, String count) {
		super();
		this.matchFoodId = matchFoodId;
		this.matchFoodName = matchFoodName;
		this.price = price;
		this.nation = nation;
		this.nationImg = nationImg;
		this.img = img;
		this.wine = wine;
		this.wineImg = wineImg;
		this.weight = weight;
		this.ex = ex;
		this.count = count;
	}
	
	
	public MatchFood(int matchFoodId, String matchFoodName, int price, String nation, String nationImg, String img,
			String wine, String wineImg, String weight, String ex) {
		super();
		this.matchFoodId = matchFoodId;
		this.matchFoodName = matchFoodName;
		this.price = price;
		this.nation = nation;
		this.nationImg = nationImg;
		this.img = img;
		this.wine = wine;
		this.wineImg = wineImg;
		this.weight = weight;
		this.ex = ex;
	}

	public MatchFood(String matchFoodName, int price, String nation, String nationImg, String img, String wine,
			String wineImg, String weight, String ex) {
		super();
		this.matchFoodName = matchFoodName;
		this.price = price;
		this.nation = nation;
		this.nationImg = nationImg;
		this.img = img;
		this.wine = wine;
		this.wineImg = wineImg;
		this.weight = weight;
		this.ex = ex;
	}

	public int getMatchFoodId() {
		return matchFoodId;
	}

	public void setMatchFoodId(int matchFoodId) {
		this.matchFoodId = matchFoodId;
	}

	public String getMatchFoodName() {
		return matchFoodName;
	}

	public void setMatchFoodName(String matchFoodName) {
		this.matchFoodName = matchFoodName;
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

	public String getNationImg() {
		return nationImg;
	}

	public void setNationImg(String nationImg) {
		this.nationImg = nationImg;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getWine() {
		return wine;
	}

	public void setWine(String wine) {
		this.wine = wine;
	}

	public String getWineImg() {
		return wineImg;
	}

	public void setWineImg(String wineImg) {
		this.wineImg = wineImg;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

}
