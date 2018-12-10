package payment.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import basket.vo.FoodRequest;
import basket.vo.ProductRequest;
import payment.vo.Payment;

@Repository("paymentDao")
public class PaymentDaoImplJDBC implements PaymentDao {

	@Autowired
	private PaymentMapper paymentMapper;

	@Override
	public List<Payment> getPaymentList(int startRow, int size, int userId) {
		Map<String, Integer> page = new HashMap<>();
		page.put("startRow", startRow);
		page.put("size", size);
		page.put("userId", userId);
		List<Payment> paymentList = paymentMapper.getPaymentList(page);
		return paymentList;
	}

	@Override
	public int getPaymentCount(int userId) {
		int count = paymentMapper.getPaymentCount(userId);
		return count;
	}

	@Override
	public void foodPayment(FoodRequest foodRequest) {
		// TODO Auto-generated method stub
		paymentMapper.foodPayment(foodRequest);
	}

	@Override
	public void productPayment(ProductRequest productRequest) {
		// TODO Auto-generated method stub
		paymentMapper.productPayment(productRequest);
	}

	@Override
	public void foodAndProductPayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentMapper.foodAndProductPayment(payment);
	}

}
