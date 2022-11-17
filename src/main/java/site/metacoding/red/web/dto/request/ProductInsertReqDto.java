package site.metacoding.red.web.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.domain.product.Product;

@NoArgsConstructor
@Setter
@Getter
public class ProductInsertReqDto {
    private boolean soldout;
    private Integer no;
    private String name;
    private Integer price;
    private Integer stock;

    public Product toEntity() {
        return Product.builder().soldout(this.soldout).no(this.no).name(this.name).price(this.price).stock(this.stock)
                .build();
    }
}
