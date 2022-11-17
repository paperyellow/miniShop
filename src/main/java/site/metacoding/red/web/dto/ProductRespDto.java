package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.Setter;

public class ProductRespDto {

    @Setter
    @Getter
    public static class ProductUpdateRespDto {
        private Integer stock;
    }
}
