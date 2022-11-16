package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.Setter;

public class PaymentReqDto {

    @Setter
    @Getter
    public static class PaymentInsertReqDto {
        private boolean cancel;
        private Integer paymentId;
        private Integer totalQuantity;
        private Integer totalPrice;

    }

    @Setter
    @Getter
    public static class PaymentUpdateReqDto {
        private boolean cancel;
        private Integer paymentId;
        private Integer totalQuantity;
        private Integer totalPrice;
    }
}
