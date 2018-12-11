package review.vo;

import java.util.List;

import product.vo.Product;
import product.vo.ProductPage;

public class ReviewPage {
	private static ReviewPage instance = new ReviewPage();

	public static ReviewPage getInstance() {
		return instance;
	}

	private ReviewPage() {
 
	}

	private List<Review> reviewList;
	private int currentPage;
	private int totalPages;
	private int total;
	private int startPage;
	private int endPage;

	public ReviewPage(List<Review> reviewList, int currentPage, int total, int size, int blockSize) {
		this.reviewList = reviewList;
		this.currentPage = currentPage;
		this.total = total;
		if (total == 0) {
			totalPages = 0;
			startPage = 0;
			endPage = 0;
		} else {
			totalPages = total / size;
			if (total % size > 0) {
				totalPages++;
			}
			startPage = currentPage / blockSize * blockSize + 1;
			if ((currentPage % blockSize == 0)) {
				startPage -= blockSize;
			}
			endPage = startPage + (blockSize - 1);
			if (endPage > totalPages) {
				endPage = totalPages;
			}
		}
	}

	public boolean hasreview() {
		return total > 0;
	}

	public List<Review> getReviewList() {
		return reviewList;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public int getTotal() {
		return total;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}


}
