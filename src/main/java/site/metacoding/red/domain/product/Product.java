package site.metacoding.red.domain.product;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class Product {
	private boolean soldout;
	private Integer productId;
	private String name;
	private Integer price;
	private Integer stock;

	// 엔티티가 아닌 필드
	private Integer no;

	@Builder
	public Product(boolean soldout, Integer productId, String name, Integer price, Integer stock, Integer no) {
		this.soldout = soldout;
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.no = no;
	}

}
