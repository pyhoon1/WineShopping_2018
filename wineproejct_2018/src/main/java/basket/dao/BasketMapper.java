package basket.dao;

import java.util.List;
import java.util.Map;

import basket.vo.Basket;
import basket.vo.FoodRequest;
import basket.vo.ProductRequest;

@BasketAnnotMapper
public interface BasketMapper {

	public void insertProduct(ProductRequest productRequest);

	// 음식만 추가하기
	public void insertMatchFood(FoodRequest foodRequest);

	// 잘 맞는 음식 같이 추가
	public void insertProductMatchFood(Basket basket);

	// 장바구니 비우기
	public void deleteAll(int userId);

	// 장바구니 안에 하나만 지우기
	public void deleteProduct(Basket basket);

	// 장바구니 카운트
	public int getBasketCount(int userId);

	// 장바구니 리스트
	public List<Basket> getBasketList(Map<String, Integer> page);

	public Basket getBasket(Basket basket);

}
