package review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import review.dao.ReviewDao;
import review.vo.Review;
import review.vo.ReviewPage;

@Service("reviewService")
public class ReviewServiceImplJDBC implements ReviewService{
	
	@Autowired
	private ReviewDao reviewDao;
	int size = 4;
	int	blockSize = 5;
	
	public ReviewPage getReviewList(int pageNum) {
		List<Review> reviewList = reviewDao.getReviewList((pageNum + 1), size, size);
		int count = reviewDao.getReviewCount();
		ReviewPage reviewPage = new ReviewPage(reviewList, pageNum, count, size, blockSize);
		return reviewPage;
	}
	
	public void insertReview(Review review) {
		reviewDao.insertReview(review);
	}
	
}
