package basket.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import basket.vo.Basket;
import basket.vo.FoodRequest;
import basket.vo.ProductRequest;

@Repository("basketDao")
public class BasketDaoImplJDBC implements BasketDao {
	@Autowired
	private BasketMapper basketMapper;

	public void insertProduct(ProductRequest productRequest) {
		basketMapper.insertProduct(productRequest);

	}

	public void insertMatchFood(FoodRequest foodRequest) {
		basketMapper.insertMatchFood(foodRequest);

	}

	
	public void insertProductMatchFood(Basket basket) {
		basketMapper.insertProductMatchFood(basket);

	}

	
	public void deleteAll(int userId) {
		basketMapper.deleteAll(userId);

	}

	
	public void deleteProduct(Basket basket) {
		basketMapper.deleteProduct(basket);

	}

	
	public List<Basket> getBasketList(int startRow, int size, int userId) {
		Map<String, Integer> page = new HashMap<>();
		page.put("startRow", startRow);
		page.put("size", size);
		page.put("userId", userId);
		List<Basket> basketList = basketMapper.getBasketList(page);
		return basketList;
	}

	
	public int getBasketCount(int userId) {
		int count = basketMapper.getBasketCount(userId);
		return count;
	}

	
	public Basket getBasket(Basket basket) {
		return basketMapper.getBasket(basket);
	}

}
