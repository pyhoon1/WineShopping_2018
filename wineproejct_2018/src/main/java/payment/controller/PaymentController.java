package payment.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import basket.service.BasketService;
import basket.vo.Basket;
import payment.service.PaymentService;
import payment.vo.Payment;
import payment.vo.PaymentPage;

@Controller
public class PaymentController {
	@Autowired
	private PaymentService paymentService;

	@Autowired
	private BasketService basketService;

	// 이름 결제시간 수단 금액
	@RequestMapping("/payment.do")
	public String payment(Model model, @RequestParam("name") String name, @RequestParam("method") String method,
			@RequestParam("total") String total, @RequestParam("userId") int userId) {
		Map<String, String> receipt = new HashMap<String, String>();
		receipt.put("name", name);
		receipt.put("method", method);
		receipt.put("total", total);
		model.addAttribute("receipt", receipt);
		List<Basket> basketList = basketService.selectByUserId(userId);
		for (int i = 0; i < basketList.size(); i++) {
			if(basketList.get(i).getProductId() ) {
				paymentService.
				
			}else {
				
			}
		}
		basketService.deleteAll(userId);

		return null;
	}

	public String paymentPage(Model model, @RequestParam("pageNum") int pageNum, @RequestParam("userId") int userId) {
		PaymentPage paymentPage = paymentService.getPaymentList(pageNum, userId);
		model.addAttribute("paymentPage", paymentPage);
		return null;
	}
}
