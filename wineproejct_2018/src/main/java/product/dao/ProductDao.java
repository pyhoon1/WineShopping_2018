package product.dao;

import java.util.List;

import product.vo.Product;

public interface ProductDao {
	public List<Product> getProductList();
	public Product getProduct(int productId);
}
