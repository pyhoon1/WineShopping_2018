package product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import product.dao.ProductDao;
import product.vo.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	public List<Product> getProductList() {
		List<Product> list = productDao.getProductList();
		return list;
	}

	public Product getProduct(int productId) {
		return productDao.getProduct(productId);
	}	
}
