package review.service;

import review.vo.Review;
import review.vo.ReviewPage;

public interface ReviewService {
	public void insertReview(Review review);
	public ReviewPage getReviewList(int pageNum);
}
