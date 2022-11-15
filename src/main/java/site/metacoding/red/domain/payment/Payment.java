package site.metacoding.red.domain.payment;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payment {
	private boolean isOuter;
	private Integer id;
	private Integer totalQuantity;
	private Integer totalPrice;

	// 엔티티가 아닌 필드

}