package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import site.metacoding.red.domain.product.Product;

public class ProductReqDto {

    @NoArgsConstructor
    @Setter
    @Getter
    public static class ProductInsertReqDto {
        private boolean soldout;
        private String name;
        private Integer price;
        private Integer stock;

        public Product toEntity() {
            return Product.builder().soldout(this.soldout).name(this.name).price(this.price)
                    .stock(this.stock)
                    .build();
                    }
       }
  
    @NoArgsConstructor
    @Setter
    @Getter
    public static class ProductUpdateReqDto {
        private Integer productId;
        private Integer stock;

        public ProductUpdateReqDto(Integer stock) {
            this.stock = stock;

        }
    }
}
