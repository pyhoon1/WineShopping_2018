package matchfood.dao;

import java.util.List;

import matchfood.vo.MatchFood;

public interface MatchFoodDao {
	public MatchFood getMatchFood(String matchFoodId);

	public List<MatchFood> getMatchFoodList(int startRow, int size);

	public int getMatchFoodCount();
}
 