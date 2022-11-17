package site.metacoding.red.domain.payment;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payment {
	private boolean cancel;
	private Integer paymentId;
	private Integer totalQuantity;
	private Integer totalPrice;

	// 엔티티가 아닌 필드

}