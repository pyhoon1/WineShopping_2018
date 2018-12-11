package basket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import basket.service.BasketService;
import basket.vo.Basket;
import basket.vo.BasketPage;
import basket.vo.FoodRequest;
import basket.vo.ProductRequest;
import matchfood.service.MatchFoodService;
import matchfood.vo.MatchFood;

@Controller
public class BasketController {
	@Autowired
	private BasketService basketService;
	@Autowired
	private MatchFoodService matchFoodService;

	@RequestMapping("/userBasket.do")
	public String goUserbasket() {
		return "userBasket";
	}
	
	@RequestMapping("/getBasketList.do")
	public String getBasketList(Model model, @RequestParam("pageNum") int pageNum, @RequestParam("userId") int userId) {
		BasketPage basketPage = basketService.getBasketList(pageNum, userId);
		int total = basketService.productTotal(userId);
		for (int i = 0; i < basketPage.getBasketList().size(); i++) {
			if (basketPage.getBasketList().get(i).getMatchFoodIdList() != null) {
				String[] matchFoodId = basketPage.getBasketList().get(i).getMatchFoodIdList().split(",");
				String[] matchFoodCount = basketPage.getBasketList().get(i).getMatchFoodCount().split(",");
				List<MatchFood> matchFoodList = new ArrayList<MatchFood>();
				for (int j = 0; j < matchFoodId.length; j++) {
					MatchFood matchFood = matchFoodService.getMatchFood(matchFoodId[j]);
					matchFood.setCount(matchFoodCount[j]);
					matchFoodList.add(matchFood);
					total += basketService.matchFoodTotal(matchFoodId[j]) * Integer.parseInt(matchFoodCount[j]);
				}
				model.addAttribute("matchFoodList" + basketPage.getBasketList().get(i).getBasketId(), matchFoodList);
			}
		}
		model.addAttribute("basketPage", basketPage);
		model.addAttribute("total", total);
		return "userBasket";
	}

	@RequestMapping("/insertProduct.do")
	public String insertProduct(@RequestParam("userId") int userId, @RequestParam("productId") int productId,
			@RequestParam("productName") String productName, @RequestParam("productPrice") int productPrice,
			@RequestParam("productCount") int productCount, @RequestParam("productImg") String productImg,
			@RequestParam("total") int total) {
		basketService.insertProduct(
				new ProductRequest(userId, productId, productName, productPrice, productCount, productImg, total));
		return "main";
	}

	@RequestMapping("/insertMatchFood.do")
	public String insertMatchFood(@RequestParam("userId") int userId, @RequestParam("matchFoodId") int matchFoodId,
			@RequestParam("productName") String productName, @RequestParam("productPrice") int productPrice,
			@RequestParam("productCount") int productCount, @RequestParam("productImg") String productImg,
			@RequestParam("total") int total) {
		basketService.insertMatchFood(
				new FoodRequest(userId, matchFoodId, productName, productPrice, productCount, productImg, total));

		return "main";
	}

	@RequestMapping("/insertProductMatchFood.do")
	public String insertProductMatchFood(@RequestParam("userId") int userId, @RequestParam("productId") int productId,
			@RequestParam("productName") String productName, @RequestParam("productPrice") int productPrice,
			@RequestParam("productCount") int productCount, @RequestParam("productImg") String productImg,
			@RequestParam("matchFoodIdList") String matchFoodIdList,
			@RequestParam("matchFoodCount") String matchFoodCount, @RequestParam("total") int total) {
		basketService.insertProductMatchFood(new Basket(userId, productId, productName, productPrice, productCount,
				productImg, matchFoodIdList, matchFoodCount, total));
		return "main";
	}

	@RequestMapping("/deleteAll.do")
	public String deleteAll(@RequestParam("userId") int userId) {
		basketService.deleteAll(userId);
		return "productListView";
	}
	/*
	 * @RequestMapping("/deleteProduct.do") public String
	 * deleteProduct(@RequestParam("userId") int userId, @RequestParam("productId")
	 * int productId) { basketService.deleteProduct(new Basket(userId, productId));
	 * return "productListView";
	 * 
	 * }
	 */

}
