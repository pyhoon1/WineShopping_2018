package product.service;

import product.vo.Product;
import product.vo.ProductPage;

public interface ProductService {

	public Product getProduct(int productId);
 
	public ProductPage getProductList(int pageNum);

}
