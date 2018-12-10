package basket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basket.dao.BasketDao;
import basket.vo.Basket;
import basket.vo.BasketPage;
import basket.vo.FoodRequest;
import basket.vo.ProductRequest;

@Service("basketService")
public class BasketServiceImplJDBC implements BasketService {
	int size = 10;
	int blockSize = 5;
	@Autowired
	private BasketDao basketDao;

	
	@Override
	public void insertProduct(ProductRequest productRequest) {
		// TODO Auto-generated method stub
		basketDao.insertProduct(productRequest);
	}

	
	@Override
	public void insertMatchFood(FoodRequest foodRequest) {
		// TODO Auto-generated method stub
		basketDao.insertMatchFood(foodRequest);

	}

	
	@Override
	public void insertProductMatchFood(Basket basket) {
		// TODO Auto-generated method stub
		basketDao.insertProductMatchFood(basket);

	}

	
	@Override
	public void deleteAll(int userId) {
		basketDao.deleteAll(userId);

	}

	
	@Override
	public void deleteProduct(Basket basket) {
		// TODO Auto-generated method stub
		basketDao.deleteProduct(basket);

	}

	
	@Override
	public BasketPage getBasketList(int pageNum, int userId) {
		List<Basket> basketList = basketDao.getBasketList((pageNum - 1) * size, size,userId);
		int count = basketDao.getBasketCount(userId);
		BasketPage basketPage = new BasketPage(basketList, pageNum, count, size, blockSize);
		return basketPage;
	}

	
	@Override
	public Basket getBasket(Basket basket) {
		return basketDao.getBasket(basket);
	}

}
