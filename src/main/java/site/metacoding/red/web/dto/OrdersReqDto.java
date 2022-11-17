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
        private Integer paymentId;

        public OrdersInsertDBReqDto(OrdersInsertReqDto ordersInsertReqDto, Integer paymentId) {
            this.cancel = ordersInsertReqDto.isCancel();
            this.productId = ordersInsertReqDto.getProductId();
            this.quantity = ordersInsertReqDto.getQuantity();
            this.paymentId = paymentId;
        }
    }

    @Setter
    @Getter
    public static class OrdersUpdateReqDto {
        private boolean cancel;
        private Integer ordersId;
        private Integer productId;
        private Integer quantity;
        private Integer paymentId;
    }

    @Setter
    @Getter
    public static class OrdersCancelReqDto {
        private boolean cancel;
        private Integer paymentId;
    }
}
