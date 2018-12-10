package matchfood.vo;

import java.util.List;

public class MatchFoodPage {
	private static MatchFoodPage instance = new MatchFoodPage();

	public static MatchFoodPage getInstance() {
		return instance;
	}

	private MatchFoodPage() {

	}
 
	private List<MatchFood> matchFoodList;
	private int currentPage;
	private int totalPages;
	private int total;
	private int startPage;
	private int endPage;

	public MatchFoodPage(List<MatchFood> matchFoodList, int currentPage, int total, int size, int blockSize) {
		this.matchFoodList = matchFoodList;
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

	public boolean hasProduct() {
		return total > 0;
	}

	public List<MatchFood> getMatchFoodList() {
		return matchFoodList;
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