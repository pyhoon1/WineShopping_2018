package review.dao;

import java.util.List;
import java.util.Map;

import review.vo.Review;

@ReviewAnnotMapper
public interface ReviewMapper {
	
	public List<Review> getReviewList(Map<String, Integer> page);
	
	public int getReviewCount();
	
	public void insertReview(Review review);
}
