package product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import matchfood.service.MatchFoodService;
import matchfood.vo.MatchFood;
import product.service.ProductService;
import product.vo.Product;
import product.vo.ProductPage;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@Autowired
	private MatchFoodService matchFoodservice;

	@RequestMapping(value = "/productList.do", method = RequestMethod.GET)
	public String getProductList(Model model, @RequestParam(value = "pageNum", required = false) int pageNum) {
		ProductPage productList = productService.getProductList(pageNum);
		model.addAttribute("productPage", productList);
		return "productListView";
	}

	@RequestMapping(value = "/productView.do", method = RequestMethod.GET)
	public String getProduct(Model model, @RequestParam("productId") int productId) {
		Product product = productService.getProduct(productId);
		String[] matchFoodId = product.getMatchFoodId().split(",");
		for (String string : matchFoodId) {
			System.out.println(string);
		}
		if (matchFoodId != null) {
			List<MatchFood> matchFoodList = new ArrayList<MatchFood>();
			for (int i = 0; i < matchFoodId.length; i++) {
				matchFoodList.add(matchFoodservice.getMatchFood(matchFoodId[i]));
			}
			model.addAttribute("matchFoodList", matchFoodList);
		}
		model.addAttribute("product", product);
		return "productView";
	}

	@RequestMapping("/main.do")
	public String goMain(Model model) {
		List<Product> products = productService.manySaleProduct();
		ProductPage products1 = productService.getProductList(1);
		model.addAttribute("products", products);
		model.addAttribute("products1", products1);

		return "main";
	}
}
