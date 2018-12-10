package product.service;

import java.util.List;

import product.vo.Product;

public interface ProductService {
	public List<Product> getProductList();
	public Product getProduct(int productId);
}
