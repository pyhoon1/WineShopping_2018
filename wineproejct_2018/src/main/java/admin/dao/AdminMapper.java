package admin.dao;

import java.util.List;

import matchfood.vo.MatchFood;
import payment.vo.Payment;
import product.vo.Product;
import review.vo.Review;
import user.vo.User;

@AdminAnnotMapper
public interface AdminMapper {
	
	//유저 맵퍼 
	List<User> getUserList(); 
	void deleteUser(int userId);
	int updateUser(User user);
	User getUserView(int userId);
	int hasUserId(String loginId);
	List<User> getSearchUserList(String condition);
	
	//상품 맵퍼
	List<Product> getProductList();
	List<Product> getSearchProductList(String condition);
	void insertProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(int productId);
	Product getProductView(int productId);
	List<MatchFood> getMatchFoodList(); 
	List<MatchFood> getSearchMatchFoodList(String condition);
	int hasMatchFood(String matchFoodName);
	void insertMatchFood(MatchFood matchFood);
	void deleteMatchFood(int matchFoodId);
	int updateMatchFood(MatchFood matchFood);
	MatchFood getMatchFoodView(int matchFoodId);
	int hasWine(String productName);
	 
	//리뷰 관련
	List<Review> getReviewList();
	void updateReviewWarning(Review review);
	void deleteReview(int reviewId);
	List<Review> getReviewUser(int userId);
	
	//결제 관련
	List<Payment> getPaymentList();
	List<Payment> getPaymentUser(int userId);	
}

