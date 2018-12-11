package payment.service;

import java.util.List;

import basket.vo.Basket;
import payment.vo.FoodRequest;
import payment.vo.Payment;
import payment.vo.PaymentPage;
import payment.vo.ProductRequest;

public interface PaymentService {
	public PaymentPage getPaymentList(int pageNum, int userId);

	public int getPaymentCount(int userId);

	public List<Payment> paymentList(int userId);

	// payment에 insert해줌
	public void productPayment(ProductRequest payment);

	public void foodPayment(FoodRequest payment);
}
