package site.metacoding.red.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.PaymentService;
import site.metacoding.red.web.dto.CMRespDto;
import site.metacoding.red.web.dto.PaymentReqDto.PaymentInsertReqDto;

@RequiredArgsConstructor
@RestController
public class PaymentController {

    final PaymentService paymentService;

    @PostMapping("/payment")
    public CMRespDto<?> insert(@RequestBody PaymentInsertReqDto paymentInsertReqDto) {
        return new CMRespDto<>(1, "성공", paymentService.insert(paymentInsertReqDto));
    }

}
