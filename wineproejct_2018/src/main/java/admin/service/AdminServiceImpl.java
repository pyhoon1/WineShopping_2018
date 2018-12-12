package admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.dao.AdminDao;
import matchfood.vo.MatchFood;
import payment.vo.Payment;
import product.vo.Product;
import review.vo.Review;
import user.vo.User;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	
	@Autowired
	private AdminDao admin;
	
	
	
	public List<User> getUserList() {
		return admin.readUserAll();
	}
 
	
	
	public void deleteUser(int userId) {
		admin.deleteUser(userId);
		
	}
 
	
	
	public List<Product> getProductList() {
		return admin.readProductAll();
	}

	
	
	
	public List<User> getSearchUserList(String condition) {
		return admin.readSearchUserAll(condition);
	}
	
	
	public Product getProductView(int productId) {
		return admin.readProduct(productId);
	}
	
	

	
	
	public void updateProduct(Product product) {
		admin.updateProduct(product);
	}

	
	
	public void deleteProduct(int productId) {
		admin.deleteProduct(productId);	
	}

	
	
	public void insertProduct(Product product) {
		admin.insertProduct(product);
		
	}
	
	
	
	public List<MatchFood> getMatchFoodList() {
		return admin.readMatchFoodAll();
	}

	
	
	public List<Review> getReviewList() {
		return admin.readReviewAll();
	}
	
	

	
	
	public void updateReviewWarning(Review review) {
		admin.updateReviewWarning(review);
		
	}

	
	
	public void deleteReview(int reviewId) {
		admin.deleteReview(reviewId);
	}

	
	
	public List<Payment> getPaymentList() {
		return admin.readPaymentAll();
	}

	
	
	public int updateUser(User user) {
		int update = admin.updateUser(user);
		return update;
		
	}

	
	
	public User getUserView(int userId) {
		User user = admin.readUser(userId);
		return user;
	}

	
	
	public List<Review> getReviewUser(int userId) {
		List<Review> review = admin.readReviewUser(userId);
		return review;
	}

	
	
	public List<Payment> getPaymentUser(int userId) {
		List<Payment> payment = admin.readPaymentUser(userId);
		return payment;
	}

	
	
	public int hasUserId(String loginId) {
		int hasUserId = admin.hasUserId(loginId);
		return hasUserId;
	}

	
	
	public List<Product> getSearchProductList(String condition) {
		List<Product> product = admin.readSearchProductFoodAll(condition);
		return product;
	}

	
	
	public List<MatchFood> getSearchMatchFoodList(String condition) {
		List<MatchFood> matchfood = admin.readSearchMatchFoodAll(condition);
		return matchfood;
	}

	
	
	public int hasMatchFood(String matchFoodName) {
		int hasMatchFood = admin.hasMatchFood(matchFoodName);
		return hasMatchFood;
	}

	
	
	public void insertMatchFood(MatchFood matchfood) {
		admin.insertMatchFood(matchfood);
		
	}


	
	public void deleteMatchFood(int matchFoodId) {
		admin.deleteMatchFood(matchFoodId);
		
	}


	
	public int updateMatchFood(MatchFood matchFood) {
		int update = admin.updateMatchFood(matchFood);
		return update;
	}


	
	public MatchFood getMatchFoodView(int matchFoodId) {
		MatchFood matchfood = admin.readMatchFood(matchFoodId);
		return matchfood;
	}


	
	public int hasWine(String productName) {
		int check = admin.hasWine(productName);
		return check;
	} 

	


	
}
