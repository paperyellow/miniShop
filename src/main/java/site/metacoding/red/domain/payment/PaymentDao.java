package site.metacoding.red.domain.payment;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.metacoding.red.web.dto.PaymentReqDto.PaymentCancelReqDto;
import site.metacoding.red.web.dto.PaymentReqDto.PaymentInsertReqDto;
import site.metacoding.red.web.dto.PaymentRespDto.PaymentFindAllRespDto;

@Repository
public interface PaymentDao {

	public void insert(PaymentInsertReqDto paymentInsertReqDto);

	public void updateCancel(PaymentCancelReqDto paymentCancelReqDto);

	public List<PaymentFindAllRespDto> findAll();
}
