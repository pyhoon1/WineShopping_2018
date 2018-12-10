package matchfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import matchfood.service.MatchFoodService;
import matchfood.vo.MatchFood;
import matchfood.vo.MatchFoodPage;

@Controller
public class MatchFoodController {
	@Autowired
	private MatchFoodService matchFoodService;

	@RequestMapping("/getMatchFood.do")
	public String getMatchFood(Model model, @RequestParam("matchFoodId") String matchFoodId) {
		MatchFood matchFood = matchFoodService.getMatchFood(matchFoodId);
		model.addAttribute("matchFood", matchFood);
		return "matchFoodView";
	} 

	@RequestMapping("/matchFoodList.do")
	public String getMatchFoodList(Model model, @RequestParam("pageNum") int pageNum) {
		MatchFoodPage matchFoodList = matchFoodService.getMatchFoodList(pageNum);
		model.addAttribute("matchFoodPage", matchFoodList);
		return "matchFoodListView";
	}
}
