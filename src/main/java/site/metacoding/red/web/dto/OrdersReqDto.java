package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.domain.order.Orders;

public class OrdersReqDto {

    @Setter
    @Getter
    public static class OrdersInsertReqDto {
        private boolean cancel;
        private Integer productId;
        private Integer quantity;
        private Integer price;
    }

    @NoArgsConstructor
    @Setter
    @Getter
    public static class OrdersInsertDBReqDto {
        private boolean cancel;
        private Integer ordersId;
        private Integer productId;
        private Integer quantity;
        private Integer payId;

        public OrdersInsertDBReqDto(OrdersInsertReqDto ordersInsertReqDto, Integer payId) {
            this.cancel = ordersInsertReqDto.isCancel();
            this.productId = ordersInsertReqDto.getProductId();
            this.quantity = ordersInsertReqDto.getQuantity();
            this.payId = payId;
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
