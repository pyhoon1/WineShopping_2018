package basket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basket.dao.BasketDao;
import basket.vo.Basket;
import basket.vo.BasketPage;
import basket.vo.FoodRequest;
import basket.vo.ProductRequest;
import matchfood.vo.MatchFood;

@Service("basketService")
public class BasketServiceImplJDBC implements BasketService {
	private int size = 10;
	private int blockSize = 5;
	@Autowired
	private BasketDao basketDao;

	public void insertProduct(ProductRequest productRequest) {
		// TODO Auto-generated method stub
		basketDao.insertProduct(productRequest);
	}

	public void insertMatchFood(FoodRequest foodRequest) {
		// TODO Auto-generated method stub
		basketDao.insertMatchFood(foodRequest);

	}

	public void insertProductMatchFood(Basket basket) {
		// TODO Auto-generated method stub
		basketDao.insertProductMatchFood(basket);

	}

	public void deleteAll(int userId) {
		basketDao.deleteAll(userId);

	}

	public void deleteProduct(Basket basket) {
		// TODO Auto-generated method stub
		basketDao.deleteProduct(basket);

	}

	public BasketPage getBasketList(int pageNum, int userId) {
		List<Basket> basketList = basketDao.getBasketList((pageNum - 1) * size, size, userId);
		int count = basketDao.getBasketCount(userId);
		BasketPage basketPage = new BasketPage(basketList, pageNum, count, size, blockSize);
		return basketPage;
	}

	public Basket getBasket(Basket basket) {
		return basketDao.getBasket(basket);
	}

	public List<Basket> selectByUserId(int userId) {
		List<Basket> basketList = basketDao.selectByUserId(userId);
		return basketList;
	}

	public int productTotal(int userId) {
		return basketDao.productTotal(userId);
	}

	public int matchFoodTotal(String matchFoodId) {

		return basketDao.matchFoodTotal(matchFoodId);

	}

}
