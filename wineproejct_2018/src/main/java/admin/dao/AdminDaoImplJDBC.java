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
	
	
	@Override
	public List<User> readUserAll() {
		List<User> user = adminMapper.getUserList();
		return user;
	}
	
	
	@Override
	public List<User> readSearchUserAll(String condition) {
		List<User> user = adminMapper.getSearchUserList(condition);
		return user;
	}

	
	@Override
	public void deleteUser(int userId) {
		adminMapper.deleteUser(userId);
	}

	
	@Override
	public List<Product> readProductAll() {
		List<Product> product = adminMapper.getProductList();
		return product;
	}

	
	@Override
	public Product readProduct(int productId) {
		Product product = adminMapper.getProductView(productId);
		return product;
	}

	
	@Override
	public void updateProduct(Product product) {
		adminMapper.updateProduct(product);
	}

	
	@Override
	public void deleteProduct(int productId) {
		adminMapper.deleteProduct(productId);
	}

	
	@Override
	public void insertProduct(Product product) {
		adminMapper.insertProduct(product);
	}

	
	@Override
	public List<Review> readReviewAll() {
		List<Review> review =  adminMapper.getReviewList();
		return review;
	}

	 
	@Override
	public void updateReviewWarning(Review review) {
		adminMapper.updateReviewWarning(review);

	}
	
	@Override
	public void deleteReview(int reviewId) {
		adminMapper.deleteReview(reviewId);
	}

	
	@Override
	public List<Payment> readPaymentAll() {
		List<Payment> payment = adminMapper.getPaymentList();
		return payment;
	}

	
	@Override
	public int updateUser(User user) {
		int update = adminMapper.updateUser(user);
		return update;
		
	}

	
	@Override
	public List<Review> readReviewUser(int userId) {
		List<Review> review = adminMapper.getReviewUser(userId);
		return review;
	}

	
	@Override
	public List<Payment> readPaymentUser(int userId) {
		List<Payment> payment = adminMapper.getPaymentUser(userId);
		return payment;
	}

	
	@Override
	public User readUser(int userId) {
		User user = adminMapper.getUserView(userId);
		return user;
	}

	
	@Override
	public int hasUserId(String loginId) {
		int hasUser = adminMapper.hasUserId(loginId);
		return hasUser;
	}

	
	@Override
	public List<MatchFood> readMatchFoodAll() {
		List<MatchFood> matchfood = adminMapper.getMatchFoodList();
		return matchfood;
	}

	
	@Override
	public List<Product> readSearchProductFoodAll(String condition) {
		List<Product> product = adminMapper.getSearchProductList(condition);
		return product;
	}

	
	@Override
	public List<MatchFood> readSearchMatchFoodAll(String condition) {
		List<MatchFood> matchfood = adminMapper.getSearchMatchFoodList(condition);
		return matchfood;
	}

	
	@Override
	public int hasMatchFood(String matchFoodName) {
		int hasMatchFood = adminMapper.hasMatchFood(matchFoodName);
		return hasMatchFood;
	}

	
	@Override
	public void insertMatchFood(MatchFood matchFood) {
		adminMapper.insertMatchFood(matchFood);	
	}


	@Override
	public void deleteMatchFood(int matchFoodId) {
		adminMapper.deleteMatchFood(matchFoodId);
	}


	@Override
	public int updateMatchFood(MatchFood matchFood) {
		int update = adminMapper.updateMatchFood(matchFood);
		return update;
	}


	@Override
	public MatchFood readMatchFood(int matchFoodId) {
		MatchFood matchfood = adminMapper.getMatchFoodView(matchFoodId);
		return matchfood;
	}


	@Override
	public int hasWine(String productName) {
		int check = adminMapper.hasWine(productName);
		return check;
	}



}
