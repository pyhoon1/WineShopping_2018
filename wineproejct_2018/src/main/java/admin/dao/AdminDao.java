package admin.dao;

import java.util.List;

import matchfood.vo.MatchFood;
import payment.vo.Payment;
import product.vo.Product;
import review.vo.Review;
import user.vo.User;

public interface AdminDao { 
	// 유저 목록을 불러옴
	public List<User> readUserAll(); 
	
	// 관리자 아이디만 수정 가능함
	public int updateUser(User user);
	
	// 유저를 삭제함
	public void deleteUser(int userId);
	
	// 유저 하나를봄
	public User readUser(int userId);
	
	// 유저 검색 기능	
	public List<User> readSearchUserAll(String condition);
	
	// 로그인 아이디가 중복되는지 화인
	public int hasUserId(String loginId);
	
	// 궁합 좋은 음식 상품을 불러옴
	public List<MatchFood> readMatchFoodAll();
	
	// 궁합에 좋은 음식이 이미 있는지 검사
	public int hasMatchFood(String matchFoodName);
	
	// 와인이 이미 있는지 확인
	public int hasWine(String productName);
	
	// 상품 목록을 불러옴
	public List<Product> readProductAll();
	
	// 상품 하나 검색
	public List<Product> readSearchProductFoodAll(String condition);
	
	// 궁합 좋은 음식 검색
	public List<MatchFood> readSearchMatchFoodAll(String condition);
	
	// 궁합 좋은 음식 삭제
	public void deleteMatchFood(int matchFoodId);
	
	// 궁합 좋은 음식 수정
	public int updateMatchFood(MatchFood matchFood);
	
	// 상품 하나의 정보를 불러옴
	public Product readProduct(int productId);
			
	// 궁합 좋은 음식 하나의 정보를 불러옴
	public MatchFood readMatchFood(int matchFoodId);
	
	// 상품 하나를 수정함
	public void updateProduct(Product product);
			
	// 상품을 삭제함
	public void deleteProduct(int productId);		
	
	// 상품을 등록함
	public void insertProduct(Product product);
	
	// 잘 맞는 음식 하나 등록
	public void insertMatchFood(MatchFood matchFood);
	
	// 리뷰 목록을 불러옴
	public List<Review> readReviewAll();
	
	// 리뷰에 경고를 넣음
	public void updateReviewWarning(Review Review);
	
	// 리뷰를 삭제함
	public void deleteReview(int ReviewId);
	 
	//유저 하나의 리뷰를 불러옴
	public List<Review> readReviewUser(int userId);
	
	// 결제 목록을 불러옴
	public List<Payment> readPaymentAll();
	
	// 유저하나의 결제 현황을 불러옴
	public List<Payment> readPaymentUser(int userId);
}
