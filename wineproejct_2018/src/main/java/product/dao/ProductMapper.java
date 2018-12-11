package product.dao;

import java.util.List;
import java.util.Map;

import product.vo.Product;

@ProductAnnotMapper
public interface ProductMapper {

	public Product getProduct(int productId);

	public List<Product> getProductList(Map<String, Integer> page);

	public int getProductCount();

	public List<Product> manySaleProduct();

}
