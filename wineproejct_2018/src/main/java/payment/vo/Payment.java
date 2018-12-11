package payment.vo;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

@Alias("Payment")
public class Payment {
	private int paymentId;
	private int userId;
	private int productId;
	private int matchFoodId;
	private String productName;
	private int productPrice;
	private int productCount;
	private String productImg;
	private String matchFoodIdList;
	private String matchFoodCount;
	private String method;
	private LocalDateTime pDay;
	public Payment(int paymentId, int userId, int productId, int matchFoodId, String productName, int productPrice,
			int productCount, String productImg, String matchFoodIdList, String matchFoodCount, String method,
			LocalDateTime pDay) {
		super();
		this.paymentId = paymentId;
		this.userId = userId;
		this.productId = productId;
		this.matchFoodId = matchFoodId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCount = productCount;
		this.productImg = productImg;
		this.matchFoodIdList = matchFoodIdList;
		this.matchFoodCount = matchFoodCount;
		this.method = method;
		this.pDay = pDay;
	}

	
	
}