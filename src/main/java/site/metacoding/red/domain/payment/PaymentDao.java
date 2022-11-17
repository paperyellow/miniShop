package site.metacoding.red.domain.payment;

import org.springframework.stereotype.Repository;

import site.metacoding.red.web.dto.PaymentReqDto.PaymentCancelReqDto;
import site.metacoding.red.web.dto.PaymentReqDto.PaymentInsertReqDto;

@Repository
public interface PaymentDao {

	public void insert(PaymentInsertReqDto paymentInsertReqDto);

	public void updateCancel(PaymentCancelReqDto paymentCancelReqDto);
}
