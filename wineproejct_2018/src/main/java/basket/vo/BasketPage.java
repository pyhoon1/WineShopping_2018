package basket.vo;

import java.util.List;

public class BasketPage {
	private static BasketPage instance = new BasketPage();

	public static BasketPage getInstance() {
		return instance;
	}

	private BasketPage() {

	}
 
	private List<Basket> basketList;
	private int currentPage;
	private int totalPages;
	private int total;
	private int startPage;
	private int endPage;

	public BasketPage(List<Basket> basketList, int currentPage, int total, int size, int blockSize) {
		this.basketList = basketList;
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

	public List<Basket> getBasketList() {
		return basketList;
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