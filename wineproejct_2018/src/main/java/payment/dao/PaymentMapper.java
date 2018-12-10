package payment.dao;

import java.util.List;
import java.util.Map;

import basket.vo.FoodRequest;
import basket.vo.ProductRequest;
import payment.vo.Payment;

@PaymentAnnotMapper
public interface PaymentMapper {
	public List<Payment> getPaymentList(Map<String, Integer> page);

	public int getPaymentCount(int userId);
 
	public void foodPayment(FoodRequest foodRequest);

	public void productPayment(ProductRequest productRequest);

	public void foodAndProductPayment(Payment payment);
}
