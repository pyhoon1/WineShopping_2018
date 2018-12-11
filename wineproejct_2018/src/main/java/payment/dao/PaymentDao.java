package payment.dao;

import java.util.List;

import basket.vo.Basket;
import payment.vo.FoodRequest;
import payment.vo.Payment;
import payment.vo.ProductRequest;

public interface PaymentDao {
	public List<Payment> getPaymentList(int startRow, int size, int userId);

	public int getPaymentCount(int userId);

	// 결제 리스트 보여줌
	public List<Payment> paymentList(int userId);

	// payment에 insert해줌
	public void productPayment(ProductRequest payment);

	public void foodPayment(FoodRequest payment);
}
