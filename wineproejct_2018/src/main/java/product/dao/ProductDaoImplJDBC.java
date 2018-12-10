package product.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import product.vo.Product;

@Repository("productDao")
public class ProductDaoImplJDBC implements ProductDao {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public Product getProduct(int productId) {
		Product product = productMapper.getProduct(productId);
		return product;
	}

	@Override
	public List<Product> getProductList(int startRow, int size) {
		Map<String, Integer> page = new HashMap<>();
		page.put("startRow", startRow);
		page.put("size", size);
		List<Product> productList = productMapper.getProductList(page);
		return productList;
	}

	@Override
	public int getProductCount() {
		return productMapper.getProductCount();
	}

}
