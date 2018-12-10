package basket.service;

import basket.vo.Basket;
import basket.vo.BasketPage;
import basket.vo.FoodRequest;
import basket.vo.ProductRequest;

public interface BasketService {
	// 장바구니 추가
	public void insertProduct(ProductRequest productRequest);

	// 음식만 추가하기
	public void insertMatchFood(FoodRequest foodRequest);

	// 잘 맞는 음식 같이 추가
	public void insertProductMatchFood(Basket basket);

	// 장바구니 비우기
	public void deleteAll(int userId);

	// 장바구니 안에 하나만 지우기
	public void deleteProduct(Basket basket);

	// 장바구니 리스트 가져오기
	public BasketPage getBasketList(int pageNum, int userId);

	public Basket getBasket(Basket basket);

}
