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
	AdminDao admin;
	
	
	@Override
	public List<User> getUserList() {
		return admin.readUserAll();
	}
 
	
	@Override
	public void deleteUser(int userId) {
		admin.deleteUser(userId);
		
	}

	
	@Override
	public List<Product> getProductList() {
		return admin.readProductAll();
	}

	
	
	@Override
	public List<User> getSearchUserList(String condition) {
		return admin.readSearchUserAll(condition);
	}
	
	@Override
	public Product getProductView(int productId) {
		return admin.readProduct(productId);
	}
	
	

	
	@Override
	public void updateProduct(Product product) {
		admin.updateProduct(product);
	}

	
	@Override
	public void deleteProduct(int productId) {
		admin.deleteProduct(productId);	
	}

	
	@Override
	public void insertProduct(Product product) {
		admin.insertProduct(product);
		
	}
	
	
	@Override
	public List<MatchFood> getMatchFoodList() {
		return admin.readMatchFoodAll();
	}

	
	@Override
	public List<Review> getReviewList() {
		return admin.readReviewAll();
	}
	
	

	
	@Override
	public void updateReviewWarning(Review review) {
		admin.updateReviewWarning(review);
		
	}

	
	@Override
	public void deleteReview(int reviewId) {
		admin.deleteReview(reviewId);
	}

	
	@Override
	public List<Payment> getPaymentList() {
		return admin.readPaymentAll();
	}

	
	@Override
	public int updateUser(User user) {
		int update = admin.updateUser(user);
		return update;
		
	}

	
	@Override
	public User getUserView(int userId) {
		User user = admin.readUser(userId);
		return user;
	}

	
	@Override
	public List<Review> getReviewUser(int userId) {
		List<Review> review = admin.readReviewUser(userId);
		return review;
	}

	
	@Override
	public List<Payment> getPaymentUser(int userId) {
		List<Payment> payment = admin.readPaymentUser(userId);
		return payment;
	}

	
	@Override
	public int hasUserId(String loginId) {
		int hasUserId = admin.hasUserId(loginId);
		return hasUserId;
	}

	
	@Override
	public List<Product> getSearchProductList(String condition) {
		List<Product> product = admin.readSearchProductFoodAll(condition);
		return product;
	}

	
	@Override
	public List<MatchFood> getSearchMatchFoodList(String condition) {
		List<MatchFood> matchfood = admin.readSearchMatchFoodAll(condition);
		return matchfood;
	}

	
	@Override
	public int hasMatchFood(String matchFoodName) {
		int hasMatchFood = admin.hasMatchFood(matchFoodName);
		return hasMatchFood;
	}

	
	@Override
	public void insertMatchFood(MatchFood matchfood) {
		admin.insertMatchFood(matchfood);
		
	}


	@Override
	public void deleteMatchFood(int matchFoodId) {
		admin.deleteMatchFood(matchFoodId);
		
	}


	@Override
	public int updateMatchFood(MatchFood matchFood) {
		int update = admin.updateMatchFood(matchFood);
		return update;
	}


	@Override
	public MatchFood getMatchFoodView(int matchFoodId) {
		MatchFood matchfood = admin.readMatchFood(matchFoodId);
		return matchfood;
	}


	@Override
	public int hasWine(String productName) {
		int check = admin.hasWine(productName);
		return check;
	}

	


	
}
