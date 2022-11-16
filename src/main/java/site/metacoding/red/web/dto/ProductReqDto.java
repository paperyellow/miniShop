package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ProductReqDto {

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
