package site.metacoding.red.domain.order;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Orders {
	private boolean cancel;
	private Integer ordersId;
	private Integer productId;
	private Integer quantity;
	private Integer payId;

	@Builder
	public Orders(boolean cancel, Integer ordersId, Integer productId, Integer quantity, Integer payId) {
		this.cancel = cancel;
		this.ordersId = ordersId;
		this.productId = productId;
		this.quantity = quantity;
		this.payId = payId;
	}

}
