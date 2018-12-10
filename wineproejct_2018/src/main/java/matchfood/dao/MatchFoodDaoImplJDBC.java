package matchfood.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import matchfood.vo.MatchFood;

@Repository("matchFoodDao")
public class MatchFoodDaoImplJDBC implements MatchFoodDao {

	@Autowired
	private MatchFoodMapper matchFoodMapper;

	
	
	public MatchFood getMatchFood(String matchFoodId) {
		MatchFood matchFood = matchFoodMapper.getMatchFood(matchFoodId);
		return matchFood;
	}

	
	
	public List<MatchFood> getMatchFoodList(int startRow, int size) {
		Map<String, Integer> page = new HashMap<String, Integer>();
		page.put("startRow", startRow);
		page.put("size", size);
		List<MatchFood> matchFoodList = matchFoodMapper.getMatchFoodList(page);
		return matchFoodList;
	}

	
	
	public int getMatchFoodCount() {
		int count = matchFoodMapper.getMatchFoodCount();
		return count;
	} 

}
