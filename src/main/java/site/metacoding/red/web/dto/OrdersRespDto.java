package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertReqDto;

public class OrdersRespDto {

    @NoArgsConstructor
    @Setter
    @Getter
    public static class OrdersInsertRespDto {
        private boolean cancel;
        private Integer productId;
        private Integer quantity;
        private Integer payId;

        public OrdersInsertRespDto(OrdersInsertReqDto ordersInsertReqDto) {
            this.cancel = ordersInsertReqDto.isCancel();
            this.productId = ordersInsertReqDto.getProductId();
            this.quantity = ordersInsertReqDto.getQuantity();
            this.payId = ordersInsertReqDto.getPayId();
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
