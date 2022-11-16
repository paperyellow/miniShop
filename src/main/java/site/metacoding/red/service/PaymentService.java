package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.payment.PaymentDao;
import site.metacoding.red.web.dto.PaymentReqDto.PaymentInsertReqDto;
import site.metacoding.red.web.dto.PaymentRespDto.PaymentInsertRespDto;

@RequiredArgsConstructor
@Service
public class PaymentService {

    final PaymentDao paymentDao;

    public PaymentInsertRespDto insert(PaymentInsertReqDto paymentInsertReqDto) {
        paymentDao.insert(paymentInsertReqDto);
        return new PaymentInsertRespDto(paymentInsertReqDto);
    }
}
