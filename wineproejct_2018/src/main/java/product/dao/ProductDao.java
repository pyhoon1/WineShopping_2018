package product.dao;

import java.util.List;

import product.vo.Product;

public interface ProductDao {
	public List<Product> getProductList(int startRow, int size);

	public Product getProduct(int productId);

	public int getProductCount();
}
