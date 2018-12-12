package admin.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import matchfood.vo.MatchFood;
import payment.vo.Payment;
import product.vo.Product;
import review.vo.Review;
import user.vo.User;

@Repository("adminDao")
public class AdminDaoImplJDBC implements AdminDao {

	@Autowired
	private AdminMapper adminMapper;
	
	
	
	public List<User> readUserAll() {
		List<User> user = adminMapper.getUserList();
		return user;
	}
	
	
	
	public List<User> readSearchUserAll(String condition) {
		List<User> user = adminMapper.getSearchUserList(condition);
		return user;
	} 

	
	
	public void deleteUser(int userId) {
		adminMapper.deleteUser(userId);
	}

	
	
	public List<Product> readProductAll() {
		List<Product> product = adminMapper.getProductList();
		return product;
	}

	
	
	public Product readProduct(int productId) {
		Product product = adminMapper.getProductView(productId);
		return product;
	}

	
	
	public void updateProduct(Product product) {
		adminMapper.updateProduct(product);
	}

	
	
	public void deleteProduct(int productId) {
		adminMapper.deleteProduct(productId);
	}

	
	
	public void insertProduct(Product product) {
		adminMapper.insertProduct(product);
	}

	
	
	public List<Review> readReviewAll() {
		List<Review> review =  adminMapper.getReviewList();
		return review;
	}

	 
	
	public void updateReviewWarning(Review review) {
		adminMapper.updateReviewWarning(review);

	}
	
	
	public void deleteReview(int reviewId) {
		adminMapper.deleteReview(reviewId);
	}

	
	
	public List<Payment> readPaymentAll() {
		List<Payment> payment = adminMapper.getPaymentList();
		return payment;
	}

	
	
	public int updateUser(User user) {
		int update = adminMapper.updateUser(user);
		return update;
		
	}

	
	
	public List<Review> readReviewUser(int userId) {
		List<Review> review = adminMapper.getReviewUser(userId);
		return review;
	}

	
	
	public List<Payment> readPaymentUser(int userId) {
		List<Payment> payment = adminMapper.getPaymentUser(userId);
		return payment;
	}

	
	
	public User readUser(int userId) {
		User user = adminMapper.getUserView(userId);
		return user;
	}

	
	
	public int hasUserId(String loginId) {
		int hasUser = adminMapper.hasUserId(loginId);
		return hasUser;
	}

	
	
	public List<MatchFood> readMatchFoodAll() {
		List<MatchFood> matchfood = adminMapper.getMatchFoodList();
		return matchfood;
	}

	
	
	public List<Product> readSearchProductFoodAll(String condition) {
		List<Product> product = adminMapper.getSearchProductList(condition);
		return product;
	}

	
	
	public List<MatchFood> readSearchMatchFoodAll(String condition) {
		List<MatchFood> matchfood = adminMapper.getSearchMatchFoodList(condition);
		return matchfood;
	}

	
	
	public int hasMatchFood(String matchFoodName) {
		int hasMatchFood = adminMapper.hasMatchFood(matchFoodName);
		return hasMatchFood;
	}

	
	
	public void insertMatchFood(MatchFood matchFood) { 
		adminMapper.insertMatchFood(matchFood);	
	}


	
	public void deleteMatchFood(int matchFoodId) {
		adminMapper.deleteMatchFood(matchFoodId);
	}


	
	public int updateMatchFood(MatchFood matchFood) {
		int update = adminMapper.updateMatchFood(matchFood);
		return update;
	}


	
	public MatchFood readMatchFood(int matchFoodId) {
		MatchFood matchfood = adminMapper.getMatchFoodView(matchFoodId);
		return matchfood;
	}


	
	public int hasWine(String productName) {
		int check = adminMapper.hasWine(productName);
		return check;
	}



}
