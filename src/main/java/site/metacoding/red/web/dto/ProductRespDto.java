package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.Setter;

public class ProductRespDto {

    @Getter
    @Setter
    public static class ProductInsertRespDto {
        private boolean soldout;
        private Integer productId;
        private String name;
        private Integer price;
        private Integer stock;
    }
}
