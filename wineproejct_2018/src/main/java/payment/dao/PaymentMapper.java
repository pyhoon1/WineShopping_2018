package payment.dao;

import java.util.List;
import java.util.Map;

import payment.vo.FoodRequest;
import payment.vo.Payment;
import payment.vo.ProductRequest;

@PaymentAnnotMapper
public interface PaymentMapper {
	public List<Payment> getPaymentList(Map<String, Integer> page);

	public int getPaymentCount(int userId);

	// 결제 리스트 보여줌
	public List<Payment> paymentList(int userId);

	// payment에 insert해줌
	public void productPayment(ProductRequest payment);

	public void foodPayment(FoodRequest payment);

}
