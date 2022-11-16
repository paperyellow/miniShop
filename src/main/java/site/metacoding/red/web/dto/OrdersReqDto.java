package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.order.Orders;

public class OrdersReqDto {

    @Setter
    @Getter
    public static class OrdersInsertReqDto {
        private boolean cancel;
        private Integer productId;
        private Integer quantity;
        private Integer payId;

        public Orders toEntity() {
            return Orders.builder()
                    .cancel(cancel)
                    .productId(productId)
                    .quantity(quantity)
                    .payId(payId)
                    .build();
        }
    }

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
