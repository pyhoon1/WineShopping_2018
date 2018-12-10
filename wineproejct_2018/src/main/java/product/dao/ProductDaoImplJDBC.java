package product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import product.vo.Product;
@Repository("productDao")
public class ProductDaoImplJDBC implements ProductDao{

	@Autowired
	private ProductMapper productMapper;
	
	public List<Product> getProductList() {
		
		return null;
	}

	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
