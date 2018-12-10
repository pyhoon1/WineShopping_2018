package matchfood.service;

import matchfood.vo.MatchFood;
import matchfood.vo.MatchFoodPage;

public interface MatchFoodService {

	public MatchFood getMatchFood(String matchFoodId);

	public MatchFoodPage getMatchFoodList(int pageNum);

}
 