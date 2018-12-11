package review.dao;

import java.util.List;

import review.vo.Review;

public interface ReviewDao {
	public List<Review> getReviewList(int startRow, int size, int productId);

	public int getReviewCount();
	
	public void insertReview(Review review);
}
