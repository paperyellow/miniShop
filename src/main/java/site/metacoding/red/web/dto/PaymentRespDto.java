package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.web.dto.PaymentReqDto.PaymentCancelReqDto;
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
            this.paymentId = paymentInsertReqDto.getPaymentId();
            this.totalQuantity = paymentInsertReqDto.getTotalQuantity();
            this.totalPrice = paymentInsertReqDto.getTotalPrice();
        }
    }

    @Setter
    @Getter
    public static class PaymentUpdateRespDto {
        private boolean cancel;
        private Integer paymentId;
        private Integer totalQuantity;
        private Integer totalPrice;
    }

    @NoArgsConstructor
    @Setter
    @Getter
    public static class PaymentCancelRespDto {
        private boolean cancel;
        private Integer paymentId;

        public PaymentCancelRespDto(PaymentCancelReqDto paymentCancelReqDto) {
            this.cancel = paymentCancelReqDto.isCancel();
            this.paymentId = paymentCancelReqDto.getPaymentId();
        }
    }

    @Setter
    @Getter
    public static class PaymentFindAllRespDto {
        private boolean cancel;
        private Integer paymentId;
        private Integer totalQuantity;
        private Integer totalPrice;

        private Integer ordersId;
        private Integer productId;
        private Integer quantity;

        private String name;
        private Integer price;
        private Integer stock;
    }
}
