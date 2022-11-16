package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertDBReqDto;

public class OrdersRespDto {

    @NoArgsConstructor
    @Setter
    @Getter
    public static class OrdersInsertRespDto {
        private boolean cancel;
        private Integer ordersId;
        private Integer productId;
        private Integer quantity;
        private Integer payId;

        public OrdersInsertRespDto(OrdersInsertDBReqDto ordersInsertDBReqDto) {
            this.cancel = ordersInsertDBReqDto.isCancel();
            this.ordersId = ordersInsertDBReqDto.getOrdersId();
            this.productId = ordersInsertDBReqDto.getProductId();
            this.quantity = ordersInsertDBReqDto.getQuantity();
            this.payId = ordersInsertDBReqDto.getPayId();
        }
    }

    @Setter
    @Getter
    public static class OrdersUpdateRespDto {
        private boolean cancel;
        private Integer ordersId;
        private Integer productId;
        private Integer quantity;
        private Integer payId;
    }
}
