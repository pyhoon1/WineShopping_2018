package product.dao;

import java.util.List;

import product.vo.Product;

@ProductAnnotMapper
public interface ProductMapper {
	public List<Product> getProductList();
	public Product getProduct(int productId);
}
