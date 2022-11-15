package site.metacoding.red.domain.order;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Orders {
	private boolean cancel;
	private Integer ordersId;
	private Integer productId;
	private Integer quantity;
	private Integer payId;

	// 엔티티가 아닌 필드

}
