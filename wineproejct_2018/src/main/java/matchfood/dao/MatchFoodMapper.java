package matchfood.dao;

import java.util.List;
import java.util.Map;

import matchfood.vo.MatchFood;

@MatchFoodAnnotMapper
public interface MatchFoodMapper {
	public MatchFood getMatchFood(String matchFoodId);

	public List<MatchFood> getMatchFoodList(Map<String, Integer> page);

	public int getMatchFoodCount();
} 
