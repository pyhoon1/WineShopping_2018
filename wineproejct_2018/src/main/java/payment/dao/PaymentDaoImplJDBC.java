package payment.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import basket.vo.Basket;
import payment.vo.FoodRequest;
import payment.vo.Payment;
import payment.vo.ProductRequest;

@Repository("paymentDao")
public class PaymentDaoImplJDBC implements PaymentDao {

	@Autowired
	private PaymentMapper paymentMapper;

	public List<Payment> getPaymentList(int startRow, int size, int userId) {
		Map<String, Integer> page = new HashMap<String, Integer>();
		page.put("startRow", startRow);
		page.put("size", size);
		page.put("userId", userId);
		List<Payment> paymentList = paymentMapper.getPaymentList(page);
		return paymentList;
	}

	public int getPaymentCount(int userId) {
		int count = paymentMapper.getPaymentCount(userId);
		return count;
	}

	public List<Payment> paymentList(int userId) {
		List<Payment> paymentList = paymentMapper.paymentList(userId);
		return paymentList;
	}

	public void productPayment(ProductRequest payment) {
		paymentMapper.productPayment(payment);

	}

	public void foodPayment(FoodRequest payment) {
		paymentMapper.foodPayment(payment);

	}

}
