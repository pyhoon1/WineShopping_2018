package payment.service;

import java.util.List;

import basket.vo.FoodRequest;
import basket.vo.ProductRequest;
import payment.vo.Payment;

public interface PaymentService {
	public List<Payment> getPaymentList(int startRow, int size, int userId);

	public int getPaymentCount(int userId);

	public void foodPayment(FoodRequest foodRequest);

	public void productPayment(ProductRequest productRequest);

	public void foodAndProductPayment(Payment payment);
}
