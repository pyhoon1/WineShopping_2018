package review.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import review.vo.Review;

@Repository("reviewDao")
public class ReviewDaoImplJDBC implements ReviewDao{
	
	@Autowired
	private ReviewMapper reviewMapper;
	

	public void insertReview(Review review) {
		reviewMapper.insertReview(review);
	}
	
	public List<Review> getReviewList(int startRow, int size) {
		Map<String, Integer> page = new HashMap<String, Integer>();
		page.put("startRow", startRow);
		page.put("size", size);
		List<Review> reviewList = reviewMapper.getReviewList(page);
		return reviewList;
	}
	
	public int getReviewCount() {
		return reviewMapper.getReviewCount();
	}

	public List<Review> getReviewList(int startRow, int size, int productId) {
		// TODO Auto-generated method stub
		return null;
	}
}
