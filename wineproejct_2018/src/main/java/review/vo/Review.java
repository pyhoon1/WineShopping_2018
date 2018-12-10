package review.vo;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

@Alias("Review")
public class Review {
	private int reviewId;
	private int productId;
	private int userId;
	private String loginId;
	private String productName;
	private String content;
	private LocalDateTime wdate;
	private String state;
	public Review() {}
	
	public Review(int reviewId, int productId, int userId, String loginId,String productName, String content, LocalDateTime wdate,
			String state) {
		this.reviewId = reviewId;
		this.productId = productId;
		this.userId = userId;
		this.loginId = loginId;
		this.productName=productName;
		this.content = content;
		this.wdate = wdate;
		this.state = state;
	}
	public Review(int productId, int userId, String loginId, String productName, String content) {
		super();
		this.productId = productId;
		this.userId = userId;
		this.loginId = loginId;
		this.productName=productName;
		this.content = content;
	}
	
	
	
	public Review(int reviewId, String state) {
		super();
		this.reviewId = reviewId;
		this.state = state;
	}

	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getWdate() {
		return wdate;
	}
	public void setWdate(LocalDateTime wdate) {
		this.wdate = wdate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
	
}
