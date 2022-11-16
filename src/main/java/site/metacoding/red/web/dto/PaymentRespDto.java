package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.web.dto.PaymentReqDto.PaymentInsertReqDto;

public class PaymentRespDto {

    @Setter
    @Getter
    public static class PaymentInsertRespDto {
        private boolean cancel;
        private Integer paymentId;
        private Integer totalQuantity;
        private Integer totalPrice;

        public PaymentInsertRespDto(PaymentInsertReqDto paymentInsertReqDto) {
            this.cancel = paymentInsertReqDto.isCancel();
            this.totalQuantity = paymentInsertReqDto.getTotalQuantity();
            this.totalPrice = paymentInsertReqDto.getTotalPrice();
        }
    }

    @Setter
    @Getter
    public static class PaymentUpdateRespDto {
        private boolean cancel;
        private Integer ordersId;
        private Integer productId;
        private Integer quantity;
        private Integer payId;
    }
}
