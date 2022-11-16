package site.metacoding.red.domain.payment;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.metacoding.red.web.dto.PaymentReqDto.PaymentInsertReqDto;

@Repository
public interface PaymentDao {

	public void insert(PaymentInsertReqDto paymentInsertReqDto);

	public void updateById(Integer id, Payment Payment);
}
