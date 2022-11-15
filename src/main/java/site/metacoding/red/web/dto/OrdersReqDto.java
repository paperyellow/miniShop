package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.Setter;

public class OrdersReqDto {

    @Setter
    @Getter
    public static class OrdersUpdateReqDto {
        private boolean cancel;
        private Integer ordersId;
        private Integer productId;
        private Integer quantity;
        private Integer payId;
    }
}
